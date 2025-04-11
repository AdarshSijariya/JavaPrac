package a1.a2.a3;

class C extends A {
    public static void main(String[] args) {
        // C x = new C();    // OK
        A x = new A();    // OK

        System.out.println(x.w);
    }    
}
