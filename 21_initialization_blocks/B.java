class B {
    {
        System.out.println("Hi");
    }

    B() {
        //super();
        //inst.init.block
        System.out.println("B()");
    }

    public static void main(String[] args) {
        B a1 = new B();
        B a2 = new B();
        B a3 = new B();
    }    
}
