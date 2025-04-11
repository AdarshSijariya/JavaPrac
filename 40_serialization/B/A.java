import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 4, 7);

        File file = new File("abc.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}