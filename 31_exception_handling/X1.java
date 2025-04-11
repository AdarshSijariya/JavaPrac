import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

class X {
    public static void main(String[] args) {
        FileReader fr = null;
        
        try {
            System.out.println(1);
            
            fr = new FileReader("yamraj.txt");
            
            System.out.println(2);            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }       
    }    
}
