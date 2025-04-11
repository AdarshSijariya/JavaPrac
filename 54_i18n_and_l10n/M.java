import java.util.Locale;

class M {
    public static void main(String[] args) {
        // Locale lc = new Locale("pt", "BR");
        // Locale lc = new Locale("zh", "CN");
        Locale lc = new Locale("da", "DK");

        // System.out.println(lc);
        System.out.println(lc.getDisplayLanguage());
        System.out.println(lc.getDisplayCountry());
    }
}
