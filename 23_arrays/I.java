class I {
    public static void main(String[] args) {
        int[] x = new int[3];

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        
        System.out.println("+++++++++++++++");
        
        x[0] = 10;
        x[1] = 11;
        x[2] = 12;
        
        System.out.println("+++++++++++++++");
        
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }    
}
