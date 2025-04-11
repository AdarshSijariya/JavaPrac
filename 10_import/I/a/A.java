package a;

// import b.B;
// import b.C;
// import b.c.D;
// import b.c.E;

import b.*;
// import b.c.*;

class A {
    public static void main(String[] args) {
        B x = new B();
        x.info();

        C y = new C();
        y.pro();

        D z = new D();
        z.aaa();

        E t = new E();
        t.bbb();
    }
}