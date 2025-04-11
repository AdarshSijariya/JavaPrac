class V {
    public static void main(String[] args) {
        // byte x = Byte.parseByte("23");
        // byte x = Byte.parseByte("128");
        byte x = Byte.parseByte("A");

        System.out.println(x);
    }    
}


//LIne No: 4, 5
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:154)
//         at java.base/java.lang.Byte.parseByte(Byte.java:178)
//         at V.main(V.java:4)