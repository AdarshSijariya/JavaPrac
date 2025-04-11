class L {
    static UThread u = null;
    static VThread v = null;

    public static void main(String[] args) {
        u = new UThread();        
        v = new VThread();
        
        u.setName("AviChhacha");
        v.setName("Dhoomketu");

        u.start();
        v.start();
    }    
}













class UThread extends Thread {
    public void run() {
        L.u.pro();
    }

    synchronized static void pro() {
        try {Thread.sleep(10);} catch(InterruptedException e) { e.printStackTrace(); }
        L.v.mno();
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class VThread extends Thread {
    public void run() {
        L.v.mno();
    }

    synchronized static void mno() {
        try {Thread.sleep(10);} catch(InterruptedException e) { e.printStackTrace(); } 
        L.u.pro();
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}
