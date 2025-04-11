class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class O {
    public static void main(String[] args) throws InterruptedException {
        AThread t1 = new AThread();
        t1.setName("A");
        t1.start();

        AThread t2 = new AThread();
        t2.setName("B");
        t2.start();

        AThread t3 = new AThread();
        t3.setName("C");
        t3.start();

        t1.sleep(500);
        // t2.sleep(1000);
        // t3.sleep(1000);

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}