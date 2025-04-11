class H {
    public static void main(String[] args) {
        System.out.println(1);

        String str = null;
        
        try {
            System.out.println(str.length());
        } catch(ArithmeticException e) {
            System.out.println("problem solved");
        }

        System.out.println(2);
    }    
}