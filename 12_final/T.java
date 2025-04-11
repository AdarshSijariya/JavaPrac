class Z {
    
}

final class Y1 extends Z {
    void pro() {
        System.out.println("pron in Z");
    }
}

class T {
    public static void main(String[] args) {
        Z x = new Y1();
        
        Y1 y = (Y1)x;

        // x.pro();
        y.pro();
    }
}
