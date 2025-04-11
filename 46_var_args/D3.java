class D3 {
    public static void main(String[] args) {
        pro("mohan", "sohan", "rohan");
    }   
    
    static void pro(String... x) {
        System.out.println(x);
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}