import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        User u1 = new User("golu", 12);
        User u2 = new User("bholu", 10);
        User u3 = new User("dholu", 9);
        
        try {
            FileOutputStream fos = new FileOutputStream("monu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(u1);
            oos.writeObject(u2);
            oos.writeObject(u3);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}