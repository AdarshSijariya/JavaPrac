class C {
    static void pro(int[] x) {
        for(int next : x) {
            System.out.println(next);
        }
    } 

    public static void main(String[] args) {
        int[] x = {12, 13, 14, 15, 16};
        
        pro(x);
    }
}