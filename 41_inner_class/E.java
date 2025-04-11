class E {
    //Instance level member variable
    int x = 47;
    
    //Instance level member method
    void pro() {
        System.out.println("---- pro() ----");
    }

    //Instance level member class
    class X {
        X() {
            System.out.println("Inner Class Constructor");
        }
    }

    public static void main(String[] args) {
        E e = new E();

        System.out.println(e.x);

        e.pro();

        e.new X();
    }
}