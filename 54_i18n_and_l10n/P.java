import java.text.SimpleDateFormat;
import java.util.Date;

class P {
    public static void main(String[] args) {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MMMMM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMMM/dd 'My Birthday' G 'at' HH-mm-ss z");

        Date dt = new Date();

        System.out.println(sdf.format(dt));
    }    
}
