class P {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println(t.isDaemon());
        
        t.setDaemon(true);

        System.out.println(t.isDaemon());
    }    
}



// false
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1410)
//         at P.main(P.java:7)
