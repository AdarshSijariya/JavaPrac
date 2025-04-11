class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class N2 {
    public static void main(String[] args) throws InterruptedException {
        AThread t = new AThread();
        t.setName("A");
        t.start();

        t.sleep(10000);

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}