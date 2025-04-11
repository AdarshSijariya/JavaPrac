class Z1 {
    public static void main(String[] args) {
        User u1 = new User("om", 12);
        Student s1 = new Student("om", 12);
        
        System.out.println(u1.equals(s1));
        System.out.println(u1.equals(u2));
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
        boolean flag = false;
        
        if(obj !=null && obj instanceof User) {
            User x1 = this;
            User x2 = (User)obj;

            String nm1 = x1.name;
            String nm2 = x2.name;

            flag = nm1.equals(nm2);
        }

        return flag;
    }
}