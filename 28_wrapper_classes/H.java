class H {
    public static void main(String[] args) {
        int x = 34;

        // String str = Integer.toString(x, 2);
        // String str = Integer.toString(x, 8);
        // String str = Integer.toString(x, 16);
        String str = Integer.toString(x, 5);
        // String str = Integer.toString(032, 8);
        // String str = Integer.toString(0x57, 16);

        System.out.println(str);
    }    
}
