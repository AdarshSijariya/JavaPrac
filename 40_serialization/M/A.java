import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Student u1 = new Student("Karn", 21, "JEC");
        Employee u2 = new Employee("Arjun", 34, 45000);
        
        try {
            FileOutputStream fos = new FileOutputStream("monu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(u1);
            oos.writeObject(u2);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}