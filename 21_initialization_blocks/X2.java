class X2 {
    static {
        int y = 12 / 0;
    }   
    
    public static void main(String[] args) {
        
    }
}


// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at X2.<clinit>(X2.java:3)
