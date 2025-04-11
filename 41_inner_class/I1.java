class Y {
    class X {
        X() {
            System.out.println("Namaste");
        }
    }
}

class I1 {
    public static void main(String[] args) {
        Y y = new Y();

        Y.X x = y.new X();
    }    
}