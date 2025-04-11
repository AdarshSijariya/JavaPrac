class I4 {
    public static void main(String[] args) {
        Integer a1 = 120;
        Integer a2 = 130;
        Integer a3 = 140;
        Integer a4 = 150;
        Integer a5 = 160;

        Integer[] w = {a1, a2, a3, a4, a5};
        int[] x = w;
    }    
}


// I4.java:10: error: incompatible types: Integer[] cannot be converted to int[]
//         int[] x = w;
//                   ^
// 1 error