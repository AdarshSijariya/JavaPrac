class X6 {     
    //2. declare a static reference variable of the same class type...
    // private static X6 y = new X6();
    private static X6 y;
    
    //1. declare all the constructors private...
    private X6() {

    }

    //declare the static variable private .... and
    //create a public static method which returns the one and only object we created using early initialization technique... 
    public static X6 getInstance() {
        if(y == null)
            y = new X6();
        
        return y;
    }
}

class F2 {
    public static void main(String[] args) {
        X6 a1 = X6.getInstance();
        X6 a2 = X6.getInstance();
        X6 a3 = X6.getInstance();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
