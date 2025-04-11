class A10 {
    private A10() {

    }

    A10 pro() {
        A10 q = new A10();
    
        return q;
    }
}

class Y1 {
    public static void main(String[] args) {
        // A10 x = new A10();

        A10 x = pro();
    }
}


// Y1.java:17: error: cannot find symbol
//         A10 x = pro();
//                 ^
//   symbol:   method pro()
//   location: class Y1
// 1 error
