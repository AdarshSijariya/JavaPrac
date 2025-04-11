class K {
    public static void main(String[] args) {
        GThread t1 = new GThread();
        HThread t2 = new HThread();
        
        t1.setName("Indumati");
        t2.setName("Chhutki");
        
        t1.start();
        t2.start();
    }    
}












class GThread extends Thread {
    public void run() {
        synchronized(Doraemon.class) {
            try {Thread.sleep(10);} catch(InterruptedException e) {e.printStackTrace();}
            synchronized(Nobita.class) {
                Thread x = Thread.currentThread();
                for(int i=0;i<20;i++)
                    System.out.println(i + " - " + x.getName());
            }}}}

class HThread extends Thread {
    public void run() {
        synchronized(Nobita.class) {
            try {Thread.sleep(10);} catch(InterruptedException e) {e.printStackTrace();}
            synchronized(Doraemon.class) {
                Thread x = Thread.currentThread();
                for(int i=0;i<20;i++)
                    System.out.println(i + " - " + x.getName());
            }}}}

class Doraemon { } 
class Nobita { } 