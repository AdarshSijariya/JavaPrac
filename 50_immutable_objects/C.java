class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class C {
    public static void main(String[] args) {
        Student x = new Student("golu", 12);
        
        System.out.println(x.name + " - " + x.age + " - " + x);
        
        x.name = "Raju";
        x.age = 5;
        
        System.out.println(x.name + " - " + x.age + " - " + x);
    }
}

// Student-class object is mutable...
