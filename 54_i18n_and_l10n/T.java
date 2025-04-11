import java.text.NumberFormat;

class T {
    public static void main(String[] args) {
        float amount = 567.23478223456f;
        
        NumberFormat nf = NumberFormat.getNumberInstance();

        System.out.println(nf.format(amount));

        nf.setMaximumFractionDigits(5);

        System.out.println(nf.format(amount) + " ~ " + nf.getMaximumFractionDigits());
    }
}