import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        User u1 = new User("golu", 12);
        User u2 = new User("bholu", 10);
        User u3 = new User("dholu", 9);
        
        try {
            FileOutputStream fos = new FileOutputStream("monu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            ArrayList<User> users = new ArrayList<>();

            users.add(u1);
            users.add(u2);
            users.add(u3);

            oos.writeObject(users);

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}