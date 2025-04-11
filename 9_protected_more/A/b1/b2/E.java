package b1.b2;

import a1.a2.a3.A;

class E extends A {
    public static void main(String[] args) {
        // E x = new E();  //OK

        A x = new A();    // NOT OK

        System.out.println(x.w);
    }
}


// b1\b2\E.java:11: error: w has protected access in A
//         System.out.println(x.w);
//                             ^
// 1 error

