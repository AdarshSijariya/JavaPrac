class K {
    public static void main(String[] args) {
        // Byte x = new Byte("23");
        // Byte x = new Byte("1a2");
        Byte x = new Byte("");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "1a2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)
//         at java.base/java.lang.Byte.parseByte(Byte.java:152)
//         at java.base/java.lang.Byte.<init>(Byte.java:331)
//         at K.main(K.java:4)
