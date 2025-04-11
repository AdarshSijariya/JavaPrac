class A {
    int x = 2;
}

interface B { 
    int x = 7;
}

class C extends A implements B {
    void pro() {
        System.out.println(C.x);
    }
}

