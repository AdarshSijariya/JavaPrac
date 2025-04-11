import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee)ois.readObject();

            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("City: " + e.address);
            System.out.println("State: " + e.address);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }    
}
