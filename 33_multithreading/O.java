class O {
    public static void main(String[] args) {
        KThread k = new KThread();
        k.setName("A");
        k.setDaemon(true);
        k.start();

        Thread t = Thread.currentThread();
        for(int i=0;i<10;i++) 
            System.out.println(i + " - " + t.getName());
    }    
}

class KThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<100;i++) 
            System.out.println(i + " - " + t.getName());
    }
}