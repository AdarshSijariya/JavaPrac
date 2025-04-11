//how to create an immutable object of a class:
//Step 1: mark your class final...

final class Student {
    //Step 2:
    //declare all the instance-variables private...
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class E {
    public static void main(String[] args) {
        Student x = new Student("hitesh", 21);
        
        System.out.println(x.name + " - " + x.age + " - " + x);
    }
}


// E.java:20: error: name has private access in Student
//         System.out.println(x.name + " - " + x.age + " - " + x);
//                             ^
// E.java:20: error: age has private access in Student
//         System.out.println(x.name + " - " + x.age + " - " + x);
//                                              ^
// 2 errors