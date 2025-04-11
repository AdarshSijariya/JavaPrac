class X1 {
    //1. declare all the constructors private...
    private X1() {

    }

    private X1(int a) {

    }
}

class C {
    public static void main(String[] args) {
        X1 x = new X1();        
    }
}



// C.java:9: error: X1() has private access in X1
//         X1 x = new X1();
//                ^
// 1 error
