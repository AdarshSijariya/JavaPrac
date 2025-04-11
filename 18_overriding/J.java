class A {
    int pro() {
        return 2;
    }
}

class J extends A {
    byte pro() {
        return 2;
    }
}

// J.java:8: error: pro() in J cannot override pro() in A
//     int pro() {
//         ^
//   return type int is not compatible with byte
// 1 error