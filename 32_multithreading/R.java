class ARunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
} 

class R {
    public static void main(String[] args) {
        Thread t = new Thread(new ARunnable(), "Abc");
        t.start();

        try {
            t.join(25);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }    
}