class Q {
    public static void main(String[] args) {
        // TA[] x = {new TA(), new TA()};    // TA is abstract; cannot be instantiated


        TA[] x = {new TB(), new TB()};

        System.out.println(x[0]);
        System.out.println(x[1]);
    }    
}


abstract class TA { }

class TB extends TA { }