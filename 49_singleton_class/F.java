class X4 {     
    //2. declare a static reference variable of the same class type...
    // private static X4 y = new X4();
    private static X4 y;
    
    //1. declare all the constructors private...
    private X4() {

    }

    //declare the static variable private .... and
    //create a public static method which returns the one and only object we created using early initialization technique... 
    public static X4 getInstance() {
        return y;
    }
}

class F {
    public static void main(String[] args) {
        X4 a1 = X4.getInstance();
        X4 a2 = X4.getInstance();
        X4 a3 = X4.getInstance();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
