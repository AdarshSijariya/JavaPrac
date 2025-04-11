class I {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Integer x = new Integer(12);

        System.out.println(x);

        @SuppressWarnings("deprecation")
        Integer y = new Integer(45);

        System.out.println(y);
    }    
}


// Note: I.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
