class O {
    public static void main(String[] args) {
        // ZB x = new ZB();   //ZB is abstract; cannot be instantiated

        ZB[] y = new ZB[2];
        // System.out.println(y.length);
        System.out.println(y[0]);
        System.out.println(y[1]);
    }    
}

interface ZB { }
