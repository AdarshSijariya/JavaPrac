class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class G {
    public static void main(String[] args) {
        Student x1 = new Student("golu", 12);
        Student x2 = new Student("bholu", 10);
        Student x3 = new Student("dholu", 8);

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
