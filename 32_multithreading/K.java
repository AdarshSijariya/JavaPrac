class MyRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<20;i++) 
            System.out.println(i + " - " + x.getName());
    }   
} 

class K {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);
        t.setName("mohan"); 
        t.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<20;i++) 
            System.out.println(i + " - " + x.getName());
    }    
}
