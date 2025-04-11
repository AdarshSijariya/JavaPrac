class F {
    public static void main(String[] args) {
        Byte x = Byte.valueOf((byte)23);
        System.out.println(x.toString());

        byte y = 78;
        // System.out.println(y.toString());   //error: byte cannot be dereferenced
        System.out.println(Byte.toString(y));
    }    
}
