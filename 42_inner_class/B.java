class B {
    private int w = 51;
    
    void pro() {
        class X {
            void info() {
                System.out.println(w);
            }
        }

        new X().info();
    }

    public static void main(String[] args) {
        new B().pro();
    }
}