class AThread extends Thread {
    public void run() {
        BThread t = new BThread();
        t.setName("Raju");
        t.start();
        try { t.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}


class BThread extends Thread {
    public void run() {
        CThread t = new CThread();
        t.setName("Jaggu");
        t.start();        
        try { t.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class CThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class S {
    public static void main(String[] args) {
        AThread t = new AThread();
        t.setName("ChhotaBheem");
        t.start();

        try { t.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        
        Thread x = Thread.currentThread();

        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName()); 
    }    
}
