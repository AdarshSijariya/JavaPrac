import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

class Y {
    public static void main(String[] args) throws IOException {
        
        //Resource Declaration
        try (FileReader fr = new FileReader("yamraj.txt");) {
            System.out.println(1);         
            
            System.out.println(fr.read());

            System.out.println(2);            
        }       
    }    
}
