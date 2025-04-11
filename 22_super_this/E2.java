class X5 {
    static int g = 8;
}

class E2 extends X5 {
    static int g = 34;

    static void pro() {
        int g = 55;
        System.out.println(g);
        // System.out.println(super.g);
        System.out.println(X5.g);
        // System.out.println(this.g);
        System.out.println(E2.g);
    }

    public static void main(String[] args) {
        pro();
    }
}
