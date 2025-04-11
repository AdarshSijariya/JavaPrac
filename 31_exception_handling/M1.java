import java.io.IOException;

class XX2 {
    void pro() throws IOException {
        System.out.println("pro in XX");
    }
}

class YY2 extends XX2 {
    void pro() throws IOException {
        System.out.println("pro in YY");
    }
}
