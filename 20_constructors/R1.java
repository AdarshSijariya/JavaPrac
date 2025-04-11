class Student {
    String name;
    int age;
    String college;
    float marks;

    Student(String name, int age, String college, float marks) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.marks = marks;
    }
}

class Teacher {
    String name;
    int age;
    String designation;
    float salary;

    Teacher(String name, int age, String designation, float salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

class R1 {
    public static void main(String[] args) {
        Student s = new Student("golu", 19, "GGCT", 67.45f);

        // s.name = "om";
        // s.age = 20;
        // s.college = "JEC";
        // s.marks = 78.5f;

        Teacher t = new Teacher("Mr Rao", 42, "juniorteacher", 34000.02f);

        // t.name = "mohan";
        // t.age = 32;
        // t.designation = "teacher";
        // t.salary = 23000.45f;

        System.out.println("Student: ");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.college);
        System.out.println(s.marks);

        System.out.println("Teacher: ");
        
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.designation);
        System.out.println(t.salary);


    }
}
