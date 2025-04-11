package b1.b2;

import a1.a2.a3.A;

class E extends A {
    public static void main(String[] args) {
        E x = new E();

        x.pro();
    }
}


// b1\b2\E.java:9: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type E
// 1 error