public class V {
    public static void main(String[] args) {
        AThread x = new AThread();

        x.setName("golu");

        x.start();

        Thread t = Thread.currentThread();

        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + t.getName());
            if(i>=10) {
                System.out.println(t.getName() + " moving to runnable...");
                Thread.yield();  
            }
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
