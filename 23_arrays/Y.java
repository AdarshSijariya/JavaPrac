class Y {
    
    public static void main(String[] args) {
        char c = 'E';
        byte b = 12;
        short s = 456;
        int i = 99;
        
        int[] x = {c, b, s, i, 5};

        for(int next : x)
            System.out.println(next);
    }
}
