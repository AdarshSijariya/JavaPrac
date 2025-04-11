class G {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();
        t.start();

        Thread x = Thread.currentThread();

        System.out.println(x);
    }    
}

class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x);
    }
}


// Exception in thread "main" Thread[Thread-0,5,main]
// java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at G.main(G.java:6)
