import java.io.IOException;
import java.io.FileNotFoundException;

class XX4 {
    void pro() throws FileNotFoundException {
        System.out.println("pro in XX");
    }
}

class YY4 extends XX4 {
    void pro() throws IOException {
        System.out.println("pro in YY");
    }
}


// N1.java:11: error: pro() in YY4 cannot override pro() in XX4
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error