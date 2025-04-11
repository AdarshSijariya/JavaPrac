class A {
    int y = 9;

    void pro() {
        System.out.println("Hello");
    }
}

class B extends A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);

        x.pro();
    }
}