class I {
    public static void main(String[] args) {
        int[][] x = new int[2][];
        
        x[0] = new int[2];
        x[1] = new int[4];
    
        for(int[] oneDArr : x) {
            for(int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }

        // for(int i=0; i < x.length; i++) {
        //     // System.out.println(x[i]);
        //     for(int j=0; j < x[i].length; j++) {
        //         // System.out.print("(" + i + ", " + j + ")   ");
        //         System.out.print(x[i][j] + " ");
        //     }

        //     System.out.println();
        // }
    }
}
