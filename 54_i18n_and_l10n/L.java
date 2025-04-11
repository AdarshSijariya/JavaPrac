import java.util.Date;
import java.util.Calendar;

class L {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);
        
        // cal.set(Calendar.DATE, -2);
        cal.add(Calendar.DATE, -2);

        dt = new Date(cal.getTimeInMillis());

        System.out.println(dt);
    }
}
