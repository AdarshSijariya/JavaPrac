final class X1 {
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

class B3 /*extends X*/ {
    public static void main(String[] args) {
        X1 x = new X1();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}