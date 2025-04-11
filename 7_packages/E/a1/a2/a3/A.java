package a1.a2.a3;

import b1.b2.B;

class A {
    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}



// a1\a2\a3\A.java:8: error: pro() is not public in B; cannot be accessed from outside package
//         x.pro();
//          ^
// 1 error