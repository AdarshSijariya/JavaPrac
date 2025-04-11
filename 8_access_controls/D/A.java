class A {
    private int y = 34;

    void pro() {
        System.out.println(y + "method");
    }
    
    A() {
        System.out.println(y + "constructor");
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}