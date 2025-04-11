class O1 { 

    {
        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");
    }
    
    O1() {
        // System.out.println("X");
        // System.out.println("Y");
        // System.out.println("Z");

        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
    
    O1(int y) {
        // System.out.println("X");
        // System.out.println("Y");
        // System.out.println("Z");

        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        
    }
    
    O1(float e) {
        // System.out.println("X");
        // System.out.println("Y");
        // System.out.println("Z");

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");        
    }

    public static void main(String[] args) {
        O1 x1 = new O1();
        System.out.println("++++++++++++++++++++++++");
        O1 x2 = new O1(2);
        System.out.println("++++++++++++++++++++++++");
        O1 x3 = new O1(2.3f);
    }
}
