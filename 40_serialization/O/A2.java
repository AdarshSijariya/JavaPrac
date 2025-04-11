import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A2 {
    public static void main(String[] args) {
        User u1 = new User("bholu", 14);
        User.maxAge = 24;
                
        try {
            FileOutputStream fos = new FileOutputStream("a2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(u1);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}