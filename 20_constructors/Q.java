class A4 {
    A4() {
        System.out.println(this + " A4()");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println(this + " B4()");
    }
}

class C4 extends B4 {
    C4() {
        System.out.println(this + " C4()");
    }
}

class Q {
    public static void main(String[] args) {
        C4 x = new C4();

        System.out.println(x + " main()");
    }
}
