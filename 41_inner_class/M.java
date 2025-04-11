class M {
    private int y = 91;

    {
        System.out.println(y + " init block");
    }   
    
    void pro() {
        System.out.println(y + " pro method");
    }
    
    M() {
        System.out.println(y + " constructor");
    }
    
    class X {
        void info() {
            System.out.println(y + " inner class method info");
        }
    }

    public static void main(String[] args) {
        M m = new M();

        System.out.println(m.y + " main method");

        m.pro();

        X e = m.new X();

        e.info();
    }
}
