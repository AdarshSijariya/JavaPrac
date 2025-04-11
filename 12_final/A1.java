class A1 {
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

class B1 extends A1 {
    void bbb() {
        System.out.println("bbb in B1");
    } 

    public static void main(String[] args) {
        B1 x = new B1();

        x.aaa();
        x.bbb();
        x.ccc();
    }    
}
