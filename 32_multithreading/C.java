class C {
    public static void main(String[] args) {
        MyThread t = new MyThread();

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

