class XRunnable implements Runnable {
    public void run() {
        try { T.t.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class T {
    static Thread t;
    public static void main(String[] args) {
        Thread g = new Thread(new XRunnable(), "Mno");
        g.start();        
        t = Thread.currentThread();
        try { g.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + t.getName());
    }
}
