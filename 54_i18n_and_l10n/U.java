import java.text.NumberFormat;
import java.text.ParseException;

class U {
    public static void main(String[] args) throws ParseException {
        
        NumberFormat nf = NumberFormat.getNumberInstance();

        // Number num = nf.parse("2345677s7a_@");
        // Number num = nf.parse("2.34");
        Number num = nf.parse("2");

        System.out.println(num);
        System.out.println(num instanceof Long);
    }
}