class X3 {
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

class B5 extends X3 {
    void bbb() {
        System.out.println("bbb in B4");
    }
    public static void main(String[] args) {
        B5 x = new B5();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}