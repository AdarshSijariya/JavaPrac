import java.util.Locale;

class N {
    public static void main(String[] args) {
        Locale lc1 = new Locale("pt", "BR");
        Locale lc2 = new Locale("zh", "CN");
        Locale lc3 = new Locale("da", "DK");
        Locale lc4 = new Locale("fr", "FR");

        System.out.println(lc1.getDisplayLanguage());
        System.out.println(lc1.getDisplayCountry());

        System.out.println(lc1.getDisplayLanguage(lc1));
        System.out.println(lc1.getDisplayCountry(lc1));
        
        System.out.println(lc1.getDisplayLanguage(lc4));
        System.out.println(lc1.getDisplayCountry(lc4));

        System.out.println(lc1.getDisplayLanguage(lc3));
        System.out.println(lc1.getDisplayCountry(lc3));
    }
}
