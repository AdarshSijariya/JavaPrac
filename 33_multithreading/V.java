class V {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        ThreadGroup tg = t.getThreadGroup();
        System.out.println("Current THread Group: " + tg.getName());
        System.out.println("Current THread: " + t.getName());
        System.out.println("++++++++++++++++++++++++++++++++++++");
        tg.list();
    }    
}
