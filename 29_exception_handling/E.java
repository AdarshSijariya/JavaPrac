class E {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int x = 23 / 0;
        } catch(ArithmeticException e) {
            System.out.println("solution");
        }

        System.out.println(2);
    }
}