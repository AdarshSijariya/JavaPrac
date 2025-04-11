class Y {
    public static void main(String[] args) {
        User u1 = new User("om", 12);
        User u2 = new User("om", 15);
        // User u3 = new User("om", 19);
        User u3 = new User("om", 19);

        //NULL test:
        System.out.println(u1.equals(null));
        System.out.println(u2.equals(null));
        System.out.println(u3.equals(null));

        //It is consistent:
        // System.out.println(u1.equals(u3));
        // System.out.println(u1.equals(u3));
        // System.out.println(u1.equals(u3));
        // System.out.println(u1.equals(u3));

        //It is transitive:
        // System.out.println(u1.equals(u2));
        // System.out.println(u2.equals(u3));
        // System.out.println(u1.equals(u3));

        //It is symmetric:
        // System.out.println(u1.equals(u2));
        // System.out.println(u2.equals(u1));

        //It is reflexive:
        // System.out.println(u1.equals(u1));
        // System.out.println(u1.equals(u1));
        // System.out.println(u1.equals(u1));
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        User x1 = this;
        User x2 = (User)obj;

        String nm1 = x1.name;
        String nm2 = null;
        if(x2 != null)
            nm2 = x2.name;

        return nm1.equals(nm2);
    }
}