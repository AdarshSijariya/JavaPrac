class H {
    class X {
        X() {
            System.out.println("Hello Ji");
        }
    }

    public static void main(String[] args) {
        //Case 1:
        // H h = new H();
        // X y = h.new X();
        
        //Case 2:
        X x = new H().new X();    
    }
}
