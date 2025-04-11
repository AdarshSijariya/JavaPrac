class E {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("mohan");
        t.start();
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + x.getName());
    }    
}

class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + x.getName());
    }
}
