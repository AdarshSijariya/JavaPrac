class A {
    int w = 23;
    
    void pro() {
        class X {
            void info() {
                System.out.println(w);
            }
        }

        new X().info();
    }

    public static void main(String[] args) {
        new A().pro();
    }
}