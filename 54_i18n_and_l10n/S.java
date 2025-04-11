import java.text.NumberFormat;
import java.util.Locale;

class S {
    public static void main(String[] args) {
        float amount = 567.2347889f;
        
        NumberFormat nf = NumberFormat.getNumberInstance();
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("hi","IN"));

        System.out.println(nf.format(amount));
    }
}