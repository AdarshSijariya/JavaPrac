class K1 {
    class X {
        private int u = 4444;
    }   
    
    public static void main(String[] args) {
        K1 t = new K1();

        X x = t.new X();

        System.out.println(x.u);
    }
}
