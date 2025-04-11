class D {
    {
        System.out.println("Bye Bye..");
    }   
    
    D() {
        // super();
        //inst.init.block
        System.out.println("D()");
    }

    D(int y) {
        this();
        
        System.out.println("D(int)");
    }

    public static void main(String[] args) {
        D a = new D(12);
    }
}
