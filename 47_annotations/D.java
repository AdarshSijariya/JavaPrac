class DD {
    void pro(int x) {
        System.out.println("Hi");
    }
}

class D extends DD {
    @Override
    void pro(float x) {
        System.out.println("Hello...");
    }

    public static void main(String[] args) {
        DD x = new D();

        x.pro(12);
    }
}


// D.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error