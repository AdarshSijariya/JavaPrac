class O {
    public static void main(String[] args) {
        String[][][] x = new String[2][3][2];

        System.out.println(x);
        System.out.println("+++++++++++++++++");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println("+++++++++++++++++");
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);
        System.out.println("+++++++++++++++++");
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
        System.out.println("+++++++++++++++++");
        System.out.println(x[0][0][0]);
        System.out.println(x[0][0][1]);
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(x[0][1][0]);
        System.out.println(x[0][1][1]);
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(x[0][2][0]);
        System.out.println(x[0][2][1]);
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(x[1][1][0]);
        System.out.println(x[1][1][1]);
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(x[1][2][0]);
        System.out.println(x[1][2][1]);
    }    
}
