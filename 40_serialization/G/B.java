import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("xyz.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee)ois.readObject();

            System.out.println(e.name);
            System.out.println(e.age);
            System.out.println(e.designation);
            System.out.println(e.salary);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
