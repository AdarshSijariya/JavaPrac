class P {
    public static void main(String[] args) {
        // Byte a = 34;
        Integer a = 34;

        pro(a);
    }   
    
    static void pro(byte x) {
        System.out.println(x);
    }
}

//line: 6
// error: incompatible types: Integer cannot be converted to byte
