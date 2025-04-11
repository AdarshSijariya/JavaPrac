class R2 {
    static void abc(int[]... x) {
        for(int[] nx : x) {
            for(int mx : nx) {
                System.out.print(mx + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] x = {{1,2,3,4},{5,6,7},{8,9,10,11,12}};
        abc(x);
    }    
}