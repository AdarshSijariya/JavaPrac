class X5 {
    static int g = 8;
}

class E1 extends X5 {
    static int g = 34;

    /*static*/ void pro() {
        int g = 55;
        System.out.println(g);
        System.out.println(super.g);
        System.out.println(this.g);
    }
}
