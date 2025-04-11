abstract class M1 {
    abstract void pro();
}


class W {
    public static void main(String[] args) {
        M1 x = new M1();

        x.pro();
    }
}



// W.java:8: error: M1 is abstract; cannot be instantiated
//         M1 x = new M1();
//                ^
// 1 error