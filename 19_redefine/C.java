class A {
    void pro() {
        System.out.println("A");
    }
}

class B extends A {
    void pro() {
        System.out.println("B");
    }
} 

class C {
    public static void main(String[] args) {
        A x = new B();

        x.pro();
    }
}

// Runtime Polymorphism(Dynamic Method Dispatch)
