import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.name = "doremon";
        s.age = 5;
        s.city = "tokyo";
        s.state = "japan";
        
        new ObjectOutputStream(new FileOutputStream("mno.txt")).writeObject(s);
    }
}
