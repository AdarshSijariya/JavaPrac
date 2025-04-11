class E {
    public static void main(String[] args) {
        pro("mohan", "sohan", "rohan", "gohan", "tohan");
    }   
    
    static void pro(String... x) {
        System.out.println(x);
        System.out.println(x.length);
        
        for(String next : x) {
            System.out.println(next);
        }
    }
}