class A {
    static void pro() {

    }
}

class R extends A {
    static int pro() {
        return 2;
    }
}


// R.java:8: error: pro() in R cannot hide pro() in A
//     static int pro() {
//                ^
//   return type int is not compatible with void
// 1 error