package a;

import b.B;
import b.c.C;

class A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);


        C y = new C();

        System.out.println(y.w);
    }
}