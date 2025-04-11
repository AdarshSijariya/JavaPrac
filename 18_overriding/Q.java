class A {
    final void pro() {

    }
}

class Q extends A {
    void pro() {

    }
}


// Q.java:8: error: pro() in Q cannot override pro() in A
//     void pro() {
//          ^
//   overridden method is final
// 1 error