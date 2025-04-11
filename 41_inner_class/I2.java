class Y {
    class X {
        X() {
            System.out.println("Namaste");
        }
    }
}

class I2 {
    public static void main(String[] args) {
        
        //Case 1:
        // Y y = new Y();
        // Y.X x = y.new X();

        //Case 2:
        Y.X w = new Y().new X();
    }    
}