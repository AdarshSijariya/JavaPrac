package b1.b2;

import a1.a2.a3.A;

class D {
    public static void main(String[] args) {
        A x = new A();

        System.out.println(x.w);
    }
}



// b1\b2\D.java:9: error: w has protected access in A
//         System.out.println(x.w);
//                             ^
// 1 error