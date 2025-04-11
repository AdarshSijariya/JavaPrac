class F {
    public static void main(String[] args) {
        int[][] x = new int[2][];

        System.out.println(x);

        System.out.println(x[0]);
        System.out.println(x[1]);

        x[0] = new int[4];
        x[1] = new int[5];


        System.out.println(x[0]);
        System.out.println(x[1]);
    }    
}
