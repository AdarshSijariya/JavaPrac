import java.text.DateFormat;
import java.util.Date;

class O1 {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        DateFormat fmt = null;

        System.out.println("~~~~~~~~~~~~~ $ ~~~~~~~~~~~~~~");
        
        fmt = DateFormat.getDateInstance();
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~DEFAULT~~~~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~~FULL~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~LONG~~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~~SHORT~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~MEDIUM~~~~~~~~~~~~~~~");
        fmt = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(fmt.format(dt));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }    
}