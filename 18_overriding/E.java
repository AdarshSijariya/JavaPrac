class A {
    void pro() {

    }
}

class E extends A {
    static void pro() {

    }
}


// E.java:8: error: pro() in E cannot override pro() in A
//     static void pro() {
//                 ^
//   overriding method is static
// 1 error
