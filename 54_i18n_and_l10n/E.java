import java.util.Date;

class E {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        
        dt.setTime(dt.getTime() + 3600000);
        
        System.out.println(dt);
    }
}
