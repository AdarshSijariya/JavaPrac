class L {
    public static void main(String[] args) {
        
        // int[][] x = new int[][] {};
        // int[][] x = new int[0][];
        int[][] x = new int[0][5];
        
        System.out.println(x.length);        
        // System.out.println(x[0].length);        
        // System.out.println(x[1].length);        
    }
}


// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at L.main(L.java:7)

