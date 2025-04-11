class ARunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
} 

class Q1 {
    public static void main(String[] args) {
        Thread t = new Thread(new ARunnable(), "Abc");
        t.start();

        try {
            t.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }    
}