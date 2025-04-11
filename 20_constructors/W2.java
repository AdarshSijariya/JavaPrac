class A8 {
    private A8() {

    }
}


class W2 extends A8 {
    W2() {
        super();
    }
}


// W2.java:10: error: A8() has private access in A8
//         super();
//         ^
// 1 error

