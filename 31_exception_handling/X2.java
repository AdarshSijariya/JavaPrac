import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

class X2 {
    public static void main(String[] args) throws IOException {
        
        //Resource Declaration
        try (FileReader fr = new FileReader("yamraj.txt");) {
            System.out.println(1);         
            
            System.out.println(fr.read());

            System.out.println(2);            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        // } finally {
        //     try {
        //         fr.close();
        //     } catch(IOException e) {
        //         e.printStackTrace();
        //     }
        // }       
    }    
}
