class Y2 {    
    public static void main(String[] args) {
        char c = 'E';
        byte b = 12;
        short s = 456;
        int i = 99;

        long l = 3L;
        float f = 9.3f;
        double d = 4.56;
        
        int[] x = {c, b, s, i, 5, (int)l, (int)f, (int)d};

        for(int next : x)
            System.out.println(next);
    }
}
