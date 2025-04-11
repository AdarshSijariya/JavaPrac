class R {
    public static void main(String[] args) {
        byte x = pro();
        
        System.out.println(x);
    }   
    
    static byte pro() {
        Byte a = 23;
        // Integer a = 55;

        // return 55;   
        return a;   
    }
}


// line: 10, 12
// error: incompatible types: Integer cannot be converted to byte