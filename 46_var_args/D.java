class D {
    //... - ellipsis

    static void pro(int... x) {
        System.out.println(x);
        System.out.println(x.length);
    }    

    public static void main(String[] args) {
        // pro();
        // pro(12);
        // pro(12, 13, 14, 15);

        int[] x = {3, 5, 7, 9, 12, 14, 16, 17};
        pro(x);
    }
}
