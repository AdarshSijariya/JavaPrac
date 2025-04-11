class N1 {
    int d = 1;

    class X {
        void pro() {
            System.out.println(d);   //ok
        }
    }
    
    public static void main(String[] args) {
        N1 n = new N1();
        X x = n.new X();

        // System.out.println(x.d); //not ok
    }
}
