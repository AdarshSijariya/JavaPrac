class A {
    static void pro() {

    }
}

class D extends A {
    void pro() {

    }
}


// D.java:8: error: pro() in D cannot override pro() in A
//     void pro() {
//          ^
//   overridden method is static
// 1 error