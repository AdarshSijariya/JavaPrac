import java.io.*;

class Student implements Serializable {
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

class H {
    public static void main(String[] args) throws Exception {
        Student x = Student.getInstance();

        new ObjectOutputStream(new FileOutputStream("aaa.txt")).writeObject(x);

        Student y = (Student)(new ObjectInputStream(new FileInputStream("aaa.txt")).readObject());

        System.out.println(x);
        System.out.println(y);
    }
}
