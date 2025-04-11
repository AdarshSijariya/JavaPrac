import java.io.*;

class User implements Serializable {

}

class Student extends User {
    private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Object readResolve() {
        return x;
    }

    public static Student getInstance() {
        if(x == null)
            x = new Student("chitragupta", 500);

        return x;
    }
}

class J {
    public static void main(String[] args) throws Exception {
        Student x = Student.getInstance();

        new ObjectOutputStream(new FileOutputStream("bbb.txt")).writeObject(x);

        Student y = (Student)(new ObjectInputStream(new FileInputStream("bbb.txt")).readObject());

        System.out.println(x);
        System.out.println(y);
    }
}
