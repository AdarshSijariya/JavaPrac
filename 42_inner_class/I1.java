class WWWW {
    void pro() {
        System.out.println("Chitragupta");
    }
}

class I1 {
    static void info(WWWW w) {
        w.pro();
    }

    public static void main(String[] args) {
        info(new WWWW() {
            public void pro() {
                System.out.println("Yamraj");
            }    
        });
    }
}
