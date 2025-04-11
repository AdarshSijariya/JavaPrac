class X5 {     
    //2. declare a static reference variable of the same class type...
    // private static X5 y = new X5();
    private static X5 y;
    
    //1. declare all the constructors private...
    private X5() {

    }

    //declare the static variable private .... and
    //create a public static method which returns the one and only object we created using early initialization technique... 
    public static X5 getInstance() {
        y = new X5();
        
        return y;
    }
}

class F1 {
    public static void main(String[] args) {
        X5 a1 = X5.getInstance();
        X5 a2 = X5.getInstance();
        X5 a3 = X5.getInstance();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
