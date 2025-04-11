class I {
    static int count = 0;

    I() {
        count++;
    }

    public static void main(String[] args) {
        I x1 = new I();
        I x2 = new I();
        
        // System.out.println(x1.count);
        // System.out.println(x2.count);
        
        X1.pro();
        I x3 = new I();
        I x4 = new I();
        
        // System.out.println(x1.count);
        // System.out.println(x2.count);

        System.out.println(x3.count);
        System.out.println(x4.count);
        X2.info();
    }    
}

class X1 {
    static void pro() {
        I a = new I();
        I b = new I();
        I c = new I();
    }
}

class X2 {
    static void info() {
        I m = new I();
        I n = new I();
        I o = new I();
    }
}
