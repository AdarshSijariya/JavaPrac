class J {
    static J j = new J();
    static Class c = j.getClass();

    public static void main(String[] args) {
        XYZThread t1 = new XYZThread();
        PQRThread t2 = new PQRThread();
        t1.setName("Dholu");
        t2.setName("Bholu");
        t1.start();
        t2.start();
    }
    
    synchronized static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<20;i++) 
            System.out.println(i + " - " + t.getName());
    }
}

class XYZThread extends Thread {
    public void run() {
        J.j.pro();    
    }
}

class PQRThread extends Thread {
    public void run() {
        synchronized(J.c) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++) 
                System.out.println(i + " - " + t.getName());
        }
    }
}