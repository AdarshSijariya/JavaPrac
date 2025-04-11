import java.text.NumberFormat;

class Q {
    public static void main(String[] args) {
        float amount = 543.53287f;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println(nf.format(amount));
    }
}
