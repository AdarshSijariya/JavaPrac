class C {
    {
        System.out.println("Bye...");
    }

    C() {
        //super()
        //inst.init.block
        System.out.println("C()");
    }
    
    C(int y) {
        //super()
        //inst.init.block
        System.out.println("C(int)");
    }

    public static void main(String[] args) {
        C x = new C(10);
        C y = new C(); 
    }    
}
