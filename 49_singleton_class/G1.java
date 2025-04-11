class Student {
    private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        if(x == null)
            x = new Student("yamraj", 1000);

        return x;
    }
}

class G1 {
    public static void main(String[] args) {
        Student x1 = Student.getInstance();
        Student x2 = Student.getInstance();
        Student x3 = Student.getInstance();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
