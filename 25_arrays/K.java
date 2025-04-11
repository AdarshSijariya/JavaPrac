class K {
    public static void main(String[] args) {
        
        int[][] x = new int[2][];
        
        // x[0] = {12, 13, 14};
        x[0] = new int[]{12, 13, 14};
        x[1] = new int[]{2,4,6,8,10};

        for(int[] oneDArr : x) {
            for(int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }
    }
}
