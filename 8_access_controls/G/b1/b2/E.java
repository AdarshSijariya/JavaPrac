package b1.b2;

import a1.a2.a3.A;

class E extends A {
    public static void main(String[] args) {
        E x = new E();

        System.out.println(x.w);
    }
}


// b1\b2\E.java:9: error: w is not public in A; cannot be accessed from outside package
//         System.out.println(x.w);
//                             ^
// 1 error