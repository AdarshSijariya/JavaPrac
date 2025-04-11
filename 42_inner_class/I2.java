class WWWWW {
    static void pro() {
        System.out.println("Chitragupta");
    }
}

class I2 {
    static void info(WWWWW w) {
        w.pro();
    }

    public static void main(String[] args) {
        info(new WWWWW() {
            static public void pro() {
                System.out.println("Yamraj");
            }    
        });
    }
}
