class O {
    public static void main(String[] args) {
        System.out.println("G");
        aaa();
        System.out.println("U");
    }   
    
    static void aaa() {
        System.out.println("X");
        try {
            bbb();
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("A");
    }
    
    static void bbb() {
        System.out.println("W");
        ccc();
        System.out.println("Q");        
    }
    
    static void ccc() {
        System.out.println("S");
        int y = 12/0;
        System.out.println("D");
    }
}
