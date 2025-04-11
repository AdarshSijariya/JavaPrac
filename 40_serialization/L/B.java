import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("monu.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        User x1 = (User)ois.readObject();
        User x2 = (User)ois.readObject();
        User x3 = (User)ois.readObject();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        ois.close();
    }    
}
