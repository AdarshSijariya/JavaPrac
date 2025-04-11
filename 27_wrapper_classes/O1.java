class O1 {
    public static void main(String[] args) {
        //Case 1:
        // Byte x = 128;
        // Byte y = 128;
        
        //Case 2:
        // Byte x = -1;
        // Byte y = -1;
        
        //Case 3:
        // Byte x = -128;
        // Byte y = -128;
        
        //Case 4:
        Byte x = -129;
        Byte y = -129;

        System.out.println(x == y);
    }    
}


// O1.java:3: error: incompatible types: int cannot be converted to Byte
//         Byte x = 128;
//                  ^
// O1.java:4: error: incompatible types: int cannot be converted to Byte
//         Byte y = 128;
//                  ^
// 2 errors