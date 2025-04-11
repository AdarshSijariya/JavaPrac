class Z {
    public static void main(String[] args) {
        User u1 = new User("om", 12);
        Student s1 = new Student("om", 12);
        
        u1.equals(s1);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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