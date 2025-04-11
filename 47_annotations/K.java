class K {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Integer x = new Integer(12);
        System.out.println(x);

        Integer y = new Integer(45);
        System.out.println(y);
    }    
    
    @SuppressWarnings("deprecation")
    static void pro() {
        Integer y = new Integer(45);
        System.out.println(y);

        Float t = new Float(2.3);
        System.out.println(t);
    }
}