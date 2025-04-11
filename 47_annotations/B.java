class BB {
    void process() {
        System.out.println("Hello");
    }
}

class B extends BB {
    @Override
    void proces() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        BB x = new B();

        x.process();
    }
}


// B.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error