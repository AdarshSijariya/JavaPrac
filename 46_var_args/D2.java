class D2 {
    public static void main(String[] args) {
        pro("mohan");
    }   
    
    static void pro(String... x) {
        System.out.println(x);
        System.out.println(x.length);
        System.out.println(x[0]);
    }
}