class N {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("78");
        // Byte x = Byte.valueOf("2_3");
        Byte x = Byte.valueOf("135");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"135" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:154)
//         at java.base/java.lang.Byte.valueOf(Byte.java:208)
//         at java.base/java.lang.Byte.valueOf(Byte.java:234)
//         at N.main(N.java:5)