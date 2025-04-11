class A {
    void pro() {
        System.out.println("pro in A");
    }
}

class B extends A {
    void pro() {
        System.out.println("pro in B");
    }
}

class C extends A {
    void pro() {
        System.out.println("pro in C");
    }
}

class E extends B {
    void pro() {
        System.out.println("pro in E");
    }
}
class F extends C {
    void pro() {
        System.out.println("pro in F");
    }
}

class U {
    public static void main(String[] args) {
        A x1 = new B();
        A x2 = new C();
        A x3 = new E();
        A x4 = new F();

        x1.pro();
        x2.pro();
        x3.pro();
        x4.pro();
    }
}
