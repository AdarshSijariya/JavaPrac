class Y {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        tg.list();

        XRunnable r = new XRunnable();
        ThreadGroup gp = new ThreadGroup("QUAD");
        
        Thread t1 = new Thread(gp, r, "Bharat");
        Thread t2 = new Thread(gp, r, "America");
        Thread t3 = new Thread(gp, r, "Australia");
        Thread t4 = new Thread(gp, r, "japan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("++++++++++++++++++++");

        tg.list();
    }    
}

class XRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(1000);} catch(InterruptedException e) { e.printStackTrace();}  
    }
}
