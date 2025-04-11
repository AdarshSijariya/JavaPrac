class C {
    public static void main(String[] args) {
        System.out.println(1);

        int val = Integer.parseInt("A");
        System.out.println(val);

        System.out.println(2);
    }    
}




// 1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "A"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)
//         at java.base/java.lang.Integer.parseInt(Integer.java:770)
//         at C.main(C.java:5)
