import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class XX6 {
    void pro() throws EOFException, FileNotFoundException {
        System.out.println("pro in XX");
    }
}

class YY6 extends XX6 {
    void pro() throws EOFException {
        System.out.println("pro in YY");
    }
}