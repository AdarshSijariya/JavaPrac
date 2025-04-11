final class X5 {
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

class B7 /*extends X5*/ {
    void bbb() {
        System.out.println("bbb in B4");
    }
    public static void main(String[] args) {
        // B6 x = new B6();
        X5 x = new X5();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}