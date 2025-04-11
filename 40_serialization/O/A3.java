import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A3 {
    public static void main(String[] args) {
        User u1 = new User("dholu", 16);
        User.maxAge = 26;
                
        try {
            FileOutputStream fos = new FileOutputStream("a3.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(u1);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}