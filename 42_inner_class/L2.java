class L2 {
    private int a = 502;

    void pro() {
        class X {
            void info() {
                System.out.println(a);
            }
        }

        X x = new X();
        x.info();
    }  
    
    public static void main(String[] args) {
        new L2().pro();
    }
}