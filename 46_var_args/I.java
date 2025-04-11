class I {
    I(int... x) {
        for(int next : x) {
            System.out.println(next);
        }
    }    

    public static void main(String[] args) {
        I i = new I();
    }
}
