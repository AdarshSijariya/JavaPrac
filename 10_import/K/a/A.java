package a;

// import b.B;
// import b.c.B;

class A {
    public static void main(String[] args) {
        b.B y = new b.B();
        y.info();
        
        b.c.B x = new b.c.B();
        x.info();
    }
}