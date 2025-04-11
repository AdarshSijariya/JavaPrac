class X3 {
    //early initilaization... 
    //2. create an object of the singleton class and assign it to a static reference variable of the same class type...
    private static X3 y = new X3();
    
    //1. declare all the constructors private...
    private X3() {

    }

    //declare the static variable private .... and
    //create a public static method which returns the one and only object we created using early initialization technique... 
    public static X3 getInstance() {
        return y;
    }
}

class E {
    public static void main(String[] args) {
        X3 a1 = X3.getInstance();
        X3 a2 = X3.getInstance();
        X3 a3 = X3.getInstance();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
