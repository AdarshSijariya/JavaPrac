class X2 {
    //early initilaization... 
    //2. create an object of the singleton class and assign it to a static reference variable of the same class type...
    static X2 y = new X2();
    
    //1. declare all the constructors private...
    private X2() {

    }
}

class D {
    public static void main(String[] args) {
        X2 a1 = X2.y;
        X2 a2 = X2.y;
        X2 a3 = X2.y;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
