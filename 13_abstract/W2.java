abstract class M3 {
    abstract void pro();
}


abstract class W2 extends M3 {
    public static void main(String[] args) {
        W2 x = new W2();

        x.pro();
    }
}


// W2.java:8: error: W2 is abstract; cannot be instantiated
//         W2 x = new W2();
//                ^
// 1 error