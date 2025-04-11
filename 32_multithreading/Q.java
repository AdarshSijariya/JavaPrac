class ARunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
} 

class Q {
    public static void main(String[] args) {
        Thread t = new Thread(new ARunnable(), "Abc");
        t.start();

        t.join();

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }    
}



// Q.java:15: error: unreported exception InterruptedException; must be caught or declared to be thrown
//         t.join();
//               ^
// 1 error
