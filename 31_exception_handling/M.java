import java.io.IOException;

class XX1 {
    void pro() throws IOException {
        System.out.println("pro in XX");
    }
}

class YY1 extends XX1 {
    void pro() {
        System.out.println("pro in YY");
    }
}
