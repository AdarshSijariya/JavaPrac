class L1 {
    static private int a = 501;

    static void pro() {
        class X {
            void info() {
                System.out.println(a);
            }
        }

        X x = new X();
        x.info();
    }  
    
    public static void main(String[] args) {
        pro();
    }
}