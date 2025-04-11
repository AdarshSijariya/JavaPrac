class Y1 {    
    public static void main(String[] args) {
        char c = 'E';
        byte b = 12;
        short s = 456;
        int i = 99;

        long l = 3L;
        float f = 9.3f;
        double d = 4.56;
        
        int[] x = {c, b, s, i, 5, l, f, d};

        for(int next : x)
            System.out.println(next);
    }
}


// Y1.java:12: error: incompatible types: possible lossy conversion from long to int
//         int[] x = {c, b, s, i, 5, l, f, d};
//                                   ^
// Y1.java:12: error: incompatible types: possible lossy conversion from float to int
//         int[] x = {c, b, s, i, 5, l, f, d};
//                                      ^
// Y1.java:12: error: incompatible types: possible lossy conversion from double to int
//         int[] x = {c, b, s, i, 5, l, f, d};
//                                         ^
// 3 errors