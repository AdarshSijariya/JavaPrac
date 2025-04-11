class I {
    static I a = new I();
    static I b = new I();

    public static void main(String[] args) {
        Thread t1 = new Thread(new ZRunnable(), "Kaliya");
        Thread t2 = new Thread(new YRunnable(), "Raju");

        t1.start();
        t2.start();
    }
}

class ZRunnable implements Runnable {
    public void run() {
        synchronized(I.class) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}

class YRunnable implements Runnable {
    public void run() {
        synchronized(I.class) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}
