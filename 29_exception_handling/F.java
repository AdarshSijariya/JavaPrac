class F {
    public static void main(String[] args) {
        System.out.println(1);

        int[] x = {1, 2, 3};
        try {
            System.out.println(x[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println(2);
    }    
}