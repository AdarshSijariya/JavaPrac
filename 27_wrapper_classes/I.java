class I {
    public static void main(String[] args) {
        // pro(78); //NOT OK
        pro((byte)89);  //OK
    }   
    
    static void pro(Byte x){
        System.out.println(x);
    }    
}



// I.java:3: error: incompatible types: int cannot be converted to Byte
//         pro(78);