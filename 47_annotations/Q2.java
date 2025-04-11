@FunctionalInterface
interface Q2 {
    void pro();
    void info();
}


// Q2.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   Q2 is not a functional interface
//     multiple non-overriding abstract methods found in interface Q2
// 1 error