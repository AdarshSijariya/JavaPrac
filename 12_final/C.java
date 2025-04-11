class X2 {
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

class B4 extends X2 {
    void bbb() {
        System.out.println("bbb in B4");
    }
    public static void main(String[] args) {
        X2 x = new X2();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}