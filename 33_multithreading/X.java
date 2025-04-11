class X {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        tg.list();
        
        RThread t1 = new RThread();
        RThread t2 = new RThread();
        RThread t3 = new RThread();

        t1.setName("Dholu");
        t2.setName("Bholu");
        t3.setName("Kaliya");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("++++++++++++++++++++");

        tg.list();
    }    
}

class RThread extends Thread {
    public void run() {
        try { Thread.sleep(1000);} catch(InterruptedException e) { e.printStackTrace();}  
    }
}
