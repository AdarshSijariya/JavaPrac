import java.io.IOException;

class XX11 {
    void pro() throws IndexOutOfBoundsException {
        
    }
}

class YY11 extends XX11 {
    void pro() throws IOException {

    }
}

// V.java:10: error: pro() in YY11 cannot override pro() in XX11
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error