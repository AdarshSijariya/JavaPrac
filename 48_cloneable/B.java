class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class B {
    public static void main(String[] args) {
        Student x = new Student("yamraj", 1000);

        //shallow cloning
        // Student y = x;
        
        //deep cloning...
        Student y = (Student)x.clone();
        
        y.name = "chitragupta";
        y.age = 500;

        System.out.println(x.name);
        System.out.println(x.age);
    }
}


// B.java:19: error: clone() has protected access in Object
//         Student y = (Student)x.clone();
//                               ^
// 1 error