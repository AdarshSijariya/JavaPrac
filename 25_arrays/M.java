class M {
    public static void main(String[] args) {
        
        int[][] x = new int[][] { 12, 14, 15};
        
        
        for(int[] oneDArr : x) {
            for(int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }    
    }
}



// M.java:4: error: incompatible types: int cannot be converted to int[]
//         int[][] x = new int[][] { 12, 14, 15};
//                                   ^
// M.java:4: error: incompatible types: int cannot be converted to int[]
//         int[][] x = new int[][] { 12, 14, 15};
//                                       ^
// M.java:4: error: incompatible types: int cannot be converted to int[]
//         int[][] x = new int[][] { 12, 14, 15};
//                                           ^
// 3 errors
