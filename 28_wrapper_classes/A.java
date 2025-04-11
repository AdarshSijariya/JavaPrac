class A {
    public static void main(String[] args) {
        // float x = Float.parseFloat("23.4");
        // float x = Float.parseFloat("23.4f");
        // float x = Float.parseFloat("23a.3");
        float x = Float.parseFloat("3.23e5");


        System.out.println(x);
    }
}


//Line: 5
// Exception in thread "main" java.lang.NumberFormatException: For input string: "23a.3"