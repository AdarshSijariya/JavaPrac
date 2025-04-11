import java.text.NumberFormat;
import java.util.Locale;

class R {
    public static void main(String[] args) {
        float amount = 543.53287f;
        
        // NumberFormat nf = NumberFormat.getCurrencyInstance();
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("hi","IN"));

        System.out.println(nf.format(amount));
    }
}
