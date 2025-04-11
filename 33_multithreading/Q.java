class Q {
    public static void main(String[] args) {
        KThread k = new KThread();
        k.setName("A");
        k.setDaemon(true);
        k.start();

        try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace();  }
    }    
}

class KThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName() + " - " + x.isDaemon());
        JThread t = new JThread();
        t.setName("B");
        System.out.println(t.getName() + " - " + t.isDaemon());
    }
}
class JThread extends Thread {
    public void run() {
        
    }
}