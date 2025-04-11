class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class A {
    public static void main(String[] args) {
        Student x = new Student("yamraj", 1000);

        //shallow cloning
        Student y = x;
        y.name = "chitragupta";
        y.age = 500;

        System.out.println(x.name);
        System.out.println(x.age);
    }
}