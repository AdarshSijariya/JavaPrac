class L {
    public static void main(String[] args) {

        Byte x = new Byte("128");

        System.out.println(x);
    }    
}



// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:154)
//         at java.base/java.lang.Byte.<init>(Byte.java:331)
//         at L.main(L.java:4)
