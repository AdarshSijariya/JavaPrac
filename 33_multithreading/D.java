class D {
    static D c = new D();

    public static void main(String[] args) {
        MThread t1 = new MThread();
        t1.setName("AAA");
        NThread t2 = new NThread();
        t2.setName("BBB");
        t1.start();
        t2.start();        
    }    

    synchronized static void pro() {
        Thread t = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + t.getName());
    }

    synchronized static void mno() {
        Thread t = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class MThread extends Thread {
    public void run() {
        D.c.pro();
    }
}

class NThread extends Thread {
    public void run() {
        D.c.mno();
    }
}
