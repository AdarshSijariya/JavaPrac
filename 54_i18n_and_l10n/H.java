import java.util.Date;
import java.util.Calendar;

class H {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}
