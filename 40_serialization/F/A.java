import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "hitesh";
        emp.age = 42;
        emp.designation = "manager babu";
        emp.salary = 54000;
        
        try {
            FileOutputStream fos = new FileOutputStream("xyz.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}