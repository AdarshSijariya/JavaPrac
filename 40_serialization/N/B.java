import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("monu.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<User> records = (ArrayList<User>)ois.readObject();

        System.out.println(records);

        ois.close();
    }    
}
