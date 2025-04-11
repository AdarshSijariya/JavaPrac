package b1.b2;

import a1.a2.a3.A;

class D {
    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}



// b1\b2\D.java:9: error: pro() has private access in A
//         x.pro();
//          ^
// 1 error