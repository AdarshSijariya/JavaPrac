import java.io.IOException;
import java.io.FileNotFoundException;

class XX3 {
    void pro() throws IOException {
        System.out.println("pro in XX");
    }
}

class YY3 extends XX3 {
    void pro() throws FileNotFoundException {
        System.out.println("pro in YY");
    }
}
