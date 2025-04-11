import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Student s = new Student("om", 12, new Address("jabalpur", "MP"));

        new ObjectOutputStream(new FileOutputStream(new File("abc.txt"))).writeObject(s);
    }
}