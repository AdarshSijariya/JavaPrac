import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Employee emp = new Employee("Virendra Vikram", 28, "Manager", 45000);
        
        try {
            FileOutputStream fos = new FileOutputStream("monu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}