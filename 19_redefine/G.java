class A {
    int y = 5;
}

class B extends A {
    // int y = 9;

    void pro() {
        // int y = 12;
        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
    }
}

class G {
    public static void main(String[] args) {
        B a = new B();

        a.pro();
    }
}
