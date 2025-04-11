import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Address addr = new Address();
        addr.cityName = "Chennai";
        addr.stateName = "Tamilnadu";

        Employee emp = new Employee("jay", 34, addr);

        try {
            FileOutputStream fos = new FileOutputStream("abc.txt");
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