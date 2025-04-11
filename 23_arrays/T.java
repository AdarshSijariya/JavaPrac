class User {
    String name;
    int age;
    Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Address {
    City city;
    State state;

    Address(City city, State state) {
        this.city = city;
        this.state = state;
    }
}

class City {
    String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }
}

class State {
    String stateName;

    State(String stateName) {
        this.stateName = stateName;
    }
}

class T {
    public static void main(String[] args) {
        User[] users = {
            new User("om", 12, new Address(new City("Kanpur"), new State("UP"))),
            new User("ram", 14, new Address(new City("ahmedabad"), new State("gujrat"))),
            new User("shyam", 17, new Address(new City("pune"), new State("mh")))
        };

        // System.out.println(users);

        // System.out.println(users[0]);
        // System.out.println(users[1]);
        // System.out.println(users[2]);
        
        // System.out.println(users[1].name);
        // System.out.println(users[1].age);
        // System.out.println(users[1].address);
        
        // System.out.println(users[1].address.city);
        // System.out.println(users[1].address.state);

        System.out.println(users[1].address.city.cityName);
        System.out.println(users[1].address.state.stateName);
    }
}
