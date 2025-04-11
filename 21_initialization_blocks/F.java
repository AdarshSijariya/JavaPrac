class A2 {
    { 
        System.out.println("H");
    }
    
    A2() {
        //super()
        //inst init block : line 2-3-4
        System.out.println("W");
    }
}

class F extends A2 {
    { 
        System.out.println("B");
    }
    
    F() {
        // super()
        // inst.init.block line: 14-15-16
        System.out.println("J");
    }
    
    public static void main(String[] args) {
        System.out.println("X");
        F f = new F();
        System.out.println("Q");
    }    
}
