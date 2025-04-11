public class W {
    public static void main(String[] args) {
        AThread x = new AThread();
        AThread y = new AThread();
        AThread z = new AThread();

        x.setName("ChhotaBheem");
        x.setPriority(10);
        
        y.setName("Jaggu");
        y.setPriority(7);
        
        z.setName("Raju");
        z.setPriority(3);
        
        x.start();
        y.start();
        z.start();

        Thread t = Thread.currentThread();

        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }        
}

class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<20;i++)
            System.out.println(i + " - " + t.getName()); 
    }
}
