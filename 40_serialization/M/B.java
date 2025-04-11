import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("monu.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student x1 = (Student)ois.readObject();
        Employee x2 = (Employee)ois.readObject();

        System.out.println(x1);
        System.out.println(x2);

        ois.close();
    }    
}
