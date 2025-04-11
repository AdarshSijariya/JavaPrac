class A {
    public static void main(String[] args) {
        A x = new A();
        
        x.pro();

        x.abc();

        x.mno();
    }

    void pro() {
        System.out.println("Hello");
    }
}




// A.java:7: error: cannot find symbol
//         x.abc();
//          ^
//   symbol:   method abc()
//   location: variable x of type A
// A.java:9: error: cannot find symbol
//         x.mno();
//          ^
//   symbol:   method mno()
//   location: variable x of type A
// 2 errors