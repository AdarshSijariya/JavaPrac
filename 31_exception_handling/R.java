import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class XX8 {
    void pro() throws IOException {
        System.out.println("pro in XX");
    }
}

class YY8 extends XX8 {
    void pro() throws EOFException, FileNotFoundException {
        System.out.println("pro in YY");
    }
}