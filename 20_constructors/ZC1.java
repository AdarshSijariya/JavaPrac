class A16 {
    A16(int y) {

    }
}

class ZC1 extends A16 {
    ZC1() {
        super(10);
    }   
    
    ZC1(int x) {
        super(10);
        this();
    }

    public static void main(String[] args) {
        ZC1 a = new ZC1();
    }
}


// ZC1.java:14: error: call to this must be first statement in constructor
//         this();
//             ^
// 1 error