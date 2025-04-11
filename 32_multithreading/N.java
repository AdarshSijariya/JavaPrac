class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class N {
    public static void main(String[] args) {
        AThread t = new AThread();
        t.setName("A");
        t.start();

        t.sleep();

        Thread x = Thread.currentThread();
        
        for(int i=0;i<20;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}


// N.java:16: error: no suitable method found for sleep(no arguments)
//         t.sleep();
//          ^
//     method Thread.sleep(long) is not applicable
//       (actual and formal argument lists differ in length)
//     method Thread.sleep(long,int) is not applicable
//       (actual and formal argument lists differ in length)
// 1 error