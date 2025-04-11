class AThread extends Thread {
    public void run()  throws InterruptedException {
        Thread x = Thread.currentThread();
        x.sleep(10000);        
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class P {
    public static void main(String[] args) {
        AThread t = new AThread();
        t.setName("A");
        t.start();        

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}


// P.java:2: error: run() in AThread cannot implement run() in Runnable
//     public void run()  throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error
