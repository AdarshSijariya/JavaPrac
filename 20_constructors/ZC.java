class A16 {
    A16(int y) {

    }
}

class ZC extends A16 {
    ZC() {
        super(10);
    }   
    
    ZC(int x) {
        this();
        super(10);
    }

    public static void main(String[] args) {
        ZC a = new ZC();
    }
}


// ZC.java:14: error: call to super must be first statement in constructor
//         super(10);
//              ^
// 1 error