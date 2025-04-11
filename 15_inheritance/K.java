class D1 {
    void p1() {
        System.out.println("p1 in D1");
    }
}

class D2 extends D1 {
    void p2() {
        System.out.println("p2 in D2");
    }
}

class D3 extends D2 {
    void p3() {
        System.out.println("p3 in D3");
    }
}

class K {
    public static void main(String[] args) {
        D3 x = new D3();

        x.p1();
        x.p2();
        x.p3();
    }
}


// Multi-Level Inheritance