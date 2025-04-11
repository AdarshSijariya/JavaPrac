class F1 {
    class X {
        X() {
            System.out.println("inner class X constructor");
        }
    }

    public static void main(String[] args) {
        F1 y = new F1();
        X z = y.new X();
    }    
}