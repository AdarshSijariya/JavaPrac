class O {
    public static void main(String[] args) {
        Byte x1 = Byte.valueOf("111", 10);
        Byte x2 = Byte.valueOf("111", 2);
        Byte x3 = Byte.valueOf("111", 8);
        Byte x4 = Byte.valueOf("11", 16);

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
    }    
}
