import java.util.Date;
import java.util.Calendar;

class G {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);

        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
    }
}
