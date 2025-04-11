class O { 
    
    O() {
        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");

        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
    
    O(int y) {
        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");

        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        
    }
    
    O(float e) {
        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");        
    }

    public static void main(String[] args) {
        O x1 = new O();
        System.out.println("++++++++++++++++++++++++");
        O x2 = new O(2);
        System.out.println("++++++++++++++++++++++++");
        O x3 = new O(2.3f);
    }
}
