class Z {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        ThreadGroup tg = t.getThreadGroup();
        ThreadGroup tgp = tg.getParent();
        ThreadGroup tgpp = tgp.getParent();
        System.out.println("Parent Thread Group Of System Thread Group: " + tgpp);
        System.out.println("Current THread Groups's Parent Thread Group: " + tgp.getName());
        System.out.println("Current THread Group: " + tg.getName());
        System.out.println("Current THread: " + t.getName());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        tgp.list();
    }    
}
