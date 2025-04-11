class A {
    static void pro() {
        System.out.println("A");
    }
}

class B extends A {
    static void pro() {
        System.out.println("B");
    }
} 

class D {
    public static void main(String[] args) {
        A x = new B();

        x.pro();
    }
}

// Runtime Polymorphism(Dynamic Method Dispatch)
