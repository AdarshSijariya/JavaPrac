import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        File file = new File("abc.txt");

        try {
            FileInputStream fis = new FileInputStream(file);

            ObjectInputStream ois = new ObjectInputStream(fis);

            Shape x = (Shape)ois.readObject();

            System.out.println("Shape=> Length: " + x.length + ", Width: " + x.width + ", Height: " + x.height);
        
            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
