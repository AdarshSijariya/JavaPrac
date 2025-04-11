import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        State s = new State();
        s.stateName = "Rajasthan";
        City c = new City();
        c.cityName = "Jaipur";
        Address addr = new Address();
        addr.city = c;
        addr.state = s;

        Student st = new Student("hitesh", 12, addr);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
            
            oos.writeObject(st);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}