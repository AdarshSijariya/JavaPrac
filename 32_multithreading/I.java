class I {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t.getPriority());
    }    
}

class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x);
    }
}

