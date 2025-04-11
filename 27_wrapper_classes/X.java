public class X {
    public static void main(String[] args) {
        // short x = Short.parseShort("34");
        // short x = Short.parseShort("32768");
        short x = Short.parseShort("C");

        System.out.println(x);
    }
}

//line: 4
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"32768" Radix:10

//line: 5
// Exception in thread "main" java.lang.NumberFormatException: For input string: "C"

