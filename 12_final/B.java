final class X {
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

class B /*extends X*/ {
    public static void main(String[] args) {
        B x = new B();

        x.aaa();
    }
}



// B.java:19: error: cannot find symbol
//         x.aaa();
//          ^
//   symbol:   method aaa()
//   location: variable x of type B
// 1 error