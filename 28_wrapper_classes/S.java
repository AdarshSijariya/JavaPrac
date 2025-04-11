class S {
    public static void main(String[] args) {
        Byte a = pro();

        System.out.println(a);
    }   
    
    static Byte pro() {
        byte x = 22;
        // int x = 78;

        return x;  
        // return 78;  
    }
}

//line: 10, 12
// error: incompatible types: int cannot be converted to Byte