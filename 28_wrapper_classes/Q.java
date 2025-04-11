class Q {
    public static void main(String[] args) {
        byte a = 34;
        // int a = 34;    //error: incompatible types: int cannot be converted to Byte

        pro(a);
    }   
    
    static void pro(Byte x) {
        System.out.println(x);
    }
}
