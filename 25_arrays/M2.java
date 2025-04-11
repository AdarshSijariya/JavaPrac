class M2 {
    public static void main(String[] args) {
        
        // int[][] x = new int[][] {{12,13,14}, {7,3,2,1,0}, {91,82}};
        int[][] x = {{21}, {7,9}, {11,82,7}};
        
        
        for(int[] oneDArr : x) {
            for(int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }    
    }
}


