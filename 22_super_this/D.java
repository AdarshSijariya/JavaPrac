class X4 {
    void pro() {
        System.out.println("pro in X4");
    }
}

class D extends X4 {
    void pro() {
        System.out.println("pro in D");
    }

    void info() {
        pro();
        this.pro();
        super.pro();
    }

    public static void main(String[] args) {
        D x = new D();
        x.info();
    }
}

