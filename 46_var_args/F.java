class F {
    public static void main(String[] args) {
        String[] x = {"mihan", "sihan", "rihan", "gihan", "tihan"};
        
        pro(x);
    }   
    
    static void pro(String... x) {
        System.out.println(x);
        System.out.println(x.length);
        
        for(String next : x) {
            System.out.println(next);
        }
    }
}