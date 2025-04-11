class L2 {
    public static void main(String[] args) {
        // pro(4.5f, 23, 34, 45);
        pro(23, 34, 45);
    }

    static void pro(float w, int... x) {
        System.out.println(w);
        
        System.out.println("~~~~~~~~~~~~~~");

        for(int next : x) {
            System.out.println(next);
        }
    }
}