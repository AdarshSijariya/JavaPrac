class A {
    public static void main(String[] args) {
        try {
            //problem generating code
            //code, which is dependent on problem generating code  - correct position
        } catch(ArithmeticException e) {
            //problem solving code
        } finally {
            //essential code
        }
        //code, which is dependent on problem generating code - incorrect position
    }
}