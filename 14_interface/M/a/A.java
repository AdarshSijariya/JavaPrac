package a;

import b.B;

class A implements B {
    public void info() {
        System.out.println("Hi......");
    }
    
    public static void main(String[] args) {
        A x = new A();

        x.info();
    }
}

