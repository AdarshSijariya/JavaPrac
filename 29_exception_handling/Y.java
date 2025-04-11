class Y extends RuntimeException{
    public static void main(String[] args) {
        try {
            // throw new Throwable();
            // throw new Error();
            // throw new Exception();
            // throw new RuntimeException();
            // throw new ArithmeticException();
            // throw new Y();
            // throw new Object();
        } catch(Throwable x) {
            System.out.println(x);
        }
    }    
}
