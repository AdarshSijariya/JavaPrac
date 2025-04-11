class F {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.setName("A");
        t1.start();

        BThread t2 = new BThread();
        t2.setName("B");
        t2.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<10;i++)
            System.out.println(i + " - " + x.getName());
    }    
}


class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<10;i++)
            System.out.println(i + " - " + x.getName()); 
    }
}

class BThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<10;i++)
            System.out.println(i + " - " + x.getName()); 
    }
}