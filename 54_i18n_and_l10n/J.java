import java.util.Date;
import java.util.Calendar;

class J {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);
        
        // cal.add(Calendar.DATE, 400);
        cal.roll(Calendar.DATE, 400);

        dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);
    }
}
