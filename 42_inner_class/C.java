class C {
    void pro() {
        class X {
            private int r = 8;
        }

        X x = new X();
        System.out.println(x.r);
    }

    public static void main(String[] args) {
        C c = new C();
        c.pro();
    }    
}
