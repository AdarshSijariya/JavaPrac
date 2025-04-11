import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class O2 {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        DateFormat fmt = null;
        // Locale lc = new Locale("fr","FR");
        // Locale lc = new Locale("da","DK");
        Locale lc = new Locale("pt","BR");
        System.out.println("~~~~~~~~~~~~~ $ ~~~~~~~~~~~~~~");
        
        fmt = DateFormat.getDateInstance();
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~DEFAULT~~~~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.DEFAULT, lc);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~~FULL~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.FULL, lc);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~LONG~~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.LONG, lc);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~~SHORT~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.SHORT, lc);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~MEDIUM~~~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.MEDIUM, lc);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }    
}