import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class XX7 {
    void pro()  {
        System.out.println("pro in XX");
    }
}

class YY7 extends XX7 {
    void pro() throws EOFException {
        System.out.println("pro in YY");
    }
}


// Q.java:12: error: pro() in YY7 cannot override pro() in XX7
//     void pro() throws EOFException {
//          ^
//   overridden method does not throw EOFException
// 1 error