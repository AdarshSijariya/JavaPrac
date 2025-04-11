class X {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int y = 12/0;
        } catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("+++++++++++++++");
            System.out.println(e.getMessage());
            System.out.println("+++++++++++++++");
            e.printStackTrace();
        }

        System.out.println(2);
    }    
}
