class E {
    static E c = new E();

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

    synchronized void mno() {
        Thread t = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class MThread extends Thread {
    public void run() {
        E.c.pro();
    }
}

class NThread extends Thread {
    public void run() {
        E.c.mno();
    }
}
