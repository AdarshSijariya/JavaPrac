//Functional Interface

@FunctionalInterface
interface E {
    void pro();
    void info();
}


// E.java:3: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   E is not a functional interface
//     multiple non-overriding abstract methods found in interface E
// 1 error