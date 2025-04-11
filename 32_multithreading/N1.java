class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class N1 {
    public static void main(String[] args) {
        AThread t = new AThread();
        t.setName("A");
        t.start();

        t.sleep(1000);

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}


// N1.java:16: error: unreported exception InterruptedException; must be caught or declared to be thrown
//         t.sleep(1000);
//                ^
// 1 error
