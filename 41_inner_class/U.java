class AAA {
    int y = 9;
    
    void info() {
        System.out.println("Hi");
    }
    
    class X {
        void pro() {
            System.out.println("Hello");
        }
    }
}

class U extends AAA {
    void abc() {
        System.out.println(y);

        info();

        new X().pro();
    }
    
    public static void main(String[] args) {
        U u = new U();
        u.abc();
    }
}
