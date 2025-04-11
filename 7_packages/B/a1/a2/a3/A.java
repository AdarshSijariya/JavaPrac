package a1.a2.a3;

import b1.b2.B;

class A {
    public static void main(String[] args) {
        B x;
    }
}

// a1\a2\a3\A.java:3: error: B is not public in b1.b2; cannot be accessed from outside package
// import b1.b2.B;
//             ^
// a1\a2\a3\A.java:7: error: B is not public in b1.b2; cannot be accessed from outside package
//         B x;
//         ^
// 2 errors