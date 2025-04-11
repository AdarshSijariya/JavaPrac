class A13 {
    A13(int x) {
        System.out.println(x);
    }
}

class Z1 extends A13 {
    int m = 23;

    Z1() {
        super(12);

        System.out.println(m);
    }

    public static void main(String[] args) {
        Z1 a = new Z1();
    }
}
