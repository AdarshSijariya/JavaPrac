class RR {
    private int e = 9;

    void info() {
        System.out.println("Hello" + e);
    }
}

class K {
    void pro() {
        RR r = new RR() {
            private int e = 5;
            
            void info() {
                System.out.println("Hi" + e);
            }
        };

        // System.out.println(r.e);
        r.info();
    }

    public static void main(String[] args) {
        new K().pro();
    }    
}
