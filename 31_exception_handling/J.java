class J {
    public static void main(String[] args) {
        int x = pro();
        System.out.println(x);
    }    

    static int pro() {

        try {
            int y = 12/0;
        } catch(ArithmeticException e) {
            throw new IllegalArgumentException();
        } finally {
            return 56;
        }

        // return 12;
    }
}
