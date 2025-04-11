import java.util.Calendar;
import java.util.Date;

class F {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal);

        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~ ");

        System.out.println(new Date(cal.getTimeInMillis()));
    }
}
