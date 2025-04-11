class A {
    void pro() {

    }
}

class I extends A {
    int pro() {
        return 2;
    }
}


// I.java:8: error: pro() in I cannot override pro() in A
//     int pro() {
//         ^
//   return type int is not compatible with void
// 1 error