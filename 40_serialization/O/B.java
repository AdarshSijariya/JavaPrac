import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("a1.txt");
        FileInputStream fis2 = new FileInputStream("a2.txt");
        FileInputStream fis3 = new FileInputStream("a3.txt");
        
        ObjectInputStream ois = null;
        
        ois = new ObjectInputStream(fis1);
        User x1 = (User)ois.readObject();
        System.out.println(x1);

        ois = new ObjectInputStream(fis2);
        User x2 = (User)ois.readObject();
        System.out.println(x2);
        
        ois = new ObjectInputStream(fis3);
        User x3 = (User)ois.readObject();
        System.out.println(x3);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(User.maxAge);

        ois.close();
    }    
}
