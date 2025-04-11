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
            x = new Student("chitragupta", 500);

        return x;
    }
}

class K {
    public static void main(String[] args) throws Exception {
        Student x = Student.getInstance();
        Student y = Student.getInstance();
       
        System.out.println(x);
        System.out.println(y);
    }
}
