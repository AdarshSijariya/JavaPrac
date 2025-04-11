class A {
    void pro() {
        System.out.println("pro in A");
    }
}

class B extends A {
    void pro() {
        System.out.println("pro in B");
    }
}


class T {
    public static void main(String[] args) {
        // A x = new A();
        // B x = new B();

        A x = new B();

        x.pro();
    }
}


//Runtime Polymorphism

//Dynamic Method Dispatch