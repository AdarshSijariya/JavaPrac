class H {
    static H a = new H();
    static H b = new H();

    public static void main(String[] args) {
        Thread t1 = new Thread(new ZRunnable(), "Kaliya");
        Thread t2 = new Thread(new YRunnable(), "Raju");

        t1.start();
        t2.start();
    }
}

class ZRunnable implements Runnable {
    public void run() {
        synchronized(H.a) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}

class YRunnable implements Runnable {
    public void run() {
        synchronized(H.b) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}
