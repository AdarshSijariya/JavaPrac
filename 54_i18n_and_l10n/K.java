import java.util.Date;
import java.util.Calendar;

class K {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);
        
        cal.set(Calendar.DATE, 32);

        dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);
    }
}
