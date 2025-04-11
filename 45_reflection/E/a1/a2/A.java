package a1.a2;

import b1.b2.b3.B;

class A {
    public static void main(String[] args) throws ClassNotFoundException {
        Class klass = Class.forName("b1.b2.b3.B");

        System.out.println(klass);
        System.out.println(klass.getName());
    }
}