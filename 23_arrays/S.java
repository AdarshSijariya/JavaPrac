class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Employee {
    String name;
    int age;
    Address address;

    Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class S {
    public static void main(String[] args) {
        //Case 2:
        Employee[] emps = {
            new Employee("Golu", 27, new Address("jabalpur","mp")),
            new Employee("bholu", 32, new Address("raipur","chhatisgadh")),
            new Employee("dholu", 38, new Address("jaipur", "rajasthan"))
        };

        // System.out.println(emps[1].address.city);

        for(int i=0; i < emps.length; i++) {
            System.out.println("Employee Name: " + emps[i].name + " Age: " + emps[i].age + " Address=> City: " + emps[i].address.city + " State: " + emps[i].address.state);
        }
        
        //Case 1:
        // Employee[] emps = {};
        // System.out.println(emps.length);
    }    
}
