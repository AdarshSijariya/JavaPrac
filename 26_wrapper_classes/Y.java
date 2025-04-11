class Y {
    public static void main(String[] args) {
        Integer x = Integer.valueOf("2g", 16);
        // Integer x = Integer.valueOf("A2", 16);

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "2g"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)
//         at java.base/java.lang.Integer.valueOf(Integer.java:957)
//         at Y.main(Y.java:3)