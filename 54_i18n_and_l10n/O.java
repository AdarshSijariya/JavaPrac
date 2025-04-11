import java.text.DateFormat;
import java.util.Date;

class O {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        
        DateFormat fmt = DateFormat.getDateInstance();

        String format = fmt.format(dt);

        System.out.println(format);

    }    
}
