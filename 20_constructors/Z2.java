class A14 {
    A14(int x) {
        System.out.println(x);
    }
}


class Z2 extends A14 {
    static int n = 89;

    Z2() {
        super(n);
    }

    public static void main(String[] args) {
        Z2 a  = new Z2();
    }
}
