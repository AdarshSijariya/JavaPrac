class Z {
    public static void main(String[] args) {
        byte b = 34;

        int i = b;

        // int[] x = new byte[4];
        int[] x = (int[])new byte[4];
    }    
}



// Z.java:7: error: incompatible types: byte[] cannot be converted to int[]
//         int[] x = new byte[4];
//                   ^
// 1 error