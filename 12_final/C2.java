final class X4 {
    void aaa() {
        System.out.println("aaa in A1");
    }    

    void bbb() {
        System.out.println("bbb in A1");
    }    
    
    void ccc() {
        System.out.println("ccc in A1");
    }     
}

class B6 /*extends X4*/ {
    void bbb() {
        System.out.println("bbb in B4");
    }
    public static void main(String[] args) {
        B6 x = new B6();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}



// C2.java:22: error: cannot find symbol
//         x.aaa();
//          ^
//   symbol:   method aaa()
//   location: variable x of type B6
// C2.java:24: error: cannot find symbol
//         x.ccc();
//          ^
//   symbol:   method ccc()
//   location: variable x of type B6
// 2 errors