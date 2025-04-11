import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class XX5 {
    void pro() throws FileNotFoundException {
        System.out.println("pro in XX");
    }
}

class YY5 extends XX5 {
    void pro() throws EOFException {
        System.out.println("pro in YY");
    }
}


// O.java:12: error: pro() in YY5 cannot override pro() in XX5
//     void pro() throws EOFException {
//          ^
//   overridden method does not throw EOFException
// 1 error