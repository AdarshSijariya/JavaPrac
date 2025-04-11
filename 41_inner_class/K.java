class K {
    private int w = 9999;

    class X {
        void pro() {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        K k = new K();

        X x = k.new X();

        x.pro();
    }    
}
