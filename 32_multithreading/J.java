class J {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        // t.setPriority(1);
        t.setPriority(-1);

        System.out.println(t.getName() + " - " + t.getPriority());
    }    
}



// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1141)
//         at J.main(J.java:6)
