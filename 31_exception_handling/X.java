import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

class X {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            
            FileReader fr = new FileReader("yamraj.txt");
            
            System.out.println(2);

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }       
    }    
}
