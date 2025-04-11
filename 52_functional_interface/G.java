//Functional Interface

@FunctionalInterface
interface Y {
    void info();
}

@FunctionalInterface
interface G extends Y {
    void pro();
}


// G.java:8: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   G is not a functional interface
//     multiple non-overriding abstract methods found in interface G
// 1 error
