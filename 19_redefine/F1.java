class A {
    // int y = 5;
}

class B extends A {
    int y = 9;

    void pro() {
        System.out.println(y);
        int y = 12;
    }
}

class F1 {
    public static void main(String[] args) {
        B a = new B();

        a.pro();
    }
}
