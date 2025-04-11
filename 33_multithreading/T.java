class T {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        ThreadGroup tg = t.getThreadGroup();
        System.out.println("Current THread Group: " + tg.getName() + " - " + tg);
        System.out.println("Current THread: " + t.getName() + " - " + t);
    }    
}
