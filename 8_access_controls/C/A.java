class A {
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }
}


class B {
    private void pro() {
        System.out.println("Raju");
    }
}


// A.java:5: error: pro() has private access in B
//         x.pro();
//          ^
// 1 error