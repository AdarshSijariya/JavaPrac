class H {
    public static void main(String[] args) {
        // pro(2);  //NOT OK
        pro((byte)2);   //OK
    }   
    
    static void pro(byte x) {
        System.out.println(x);
    }
}


// H.java:3: error: incompatible types: possible lossy conversion from int to byte
//         pro(2);
