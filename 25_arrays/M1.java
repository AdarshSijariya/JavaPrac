class M1 {
    public static void main(String[] args) {
        
        int[][] x = new int[][] {new int[2], new int[5], new int[3]};
        
        
        for(int[] oneDArr : x) {
            for(int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }    
    }
}


