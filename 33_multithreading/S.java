class S {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Before: " + t.getName() + " - "  + t.getPriority());
        
        t.setPriority(7);
        
        System.out.println("After: " + t.getName() + " - "  + t.getPriority());
        
        EThread e = new EThread();
        e.setName("AAA");
        
        e.start();        
    }    
}

class EThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - "  + t.getPriority());
    }
}
