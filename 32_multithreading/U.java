class U {
    public static void main(String[] args) throws InterruptedException {
        Thread t  = Thread.currentThread();

        t.join();

        for(int i=0;i<5;i++)
            System.out.println(i + " - " + t.getName());
    }
}