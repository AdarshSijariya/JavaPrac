import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A1 {
    public static void main(String[] args) {
        User u1 = new User("golu", 12);
        User.maxAge = 22;
                
        try {
            FileOutputStream fos = new FileOutputStream("a1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(u1);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}