//how to create an immutable object of a class:
//Step 1: mark your class final...

final class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class D {
    public static void main(String[] args) {
        Student x = new Student("hitesh", 21);
        
        System.out.println(x.name + " - " + x.age + " - " + x);

        x.name = "bablu";
        x.age = 18;

        System.out.println(x.name + " - " + x.age + " - " + x);
    }
}