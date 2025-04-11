class I1 {
    I1(int... x) {
        for(int next : x) {
            System.out.println(next);
        }
    }    

    public static void main(String[] args) {
        I1 i = new I1(12, 13, 14, 15, 16);
    }
}
