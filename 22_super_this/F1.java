class X6 {
    static void pro() {
        System.out.println("pro in X6");
    }
}

class F1 extends X6 {
    static void pro() {
        System.out.println("pro in F1");
    }

    public static void main(String[] args) {
        X6.pro();
        F1.pro();
        pro();
    }
}