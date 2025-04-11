class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("+++++ " + x);
    }
}

class M {
    public static void main(String[] args) {
        AThread t = new AThread();
        t.setName("A");
        t.start();

        Thread x = Thread.currentThread();
        
        //Case 1:
        // for(int i=0;i<20;i++) {
        //     System.out.println(i + " - " + x.getName());
        // }

        //Case 2:
        //System.out.println("+++++ " + x);

        System.out.println(t.isAlive());
    }
}
