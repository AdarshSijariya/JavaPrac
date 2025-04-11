class DD {
    void aaa() {
        System.out.println("aaa in DD");    
    }

    final void bbb() {
        System.out.println("bbb in DD");    
    }
    
    void ccc() {
        System.out.println("ccc in DD");    
    }
}

class H {  
    public static void main(String[] args) {
        DD x = new DD();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}
