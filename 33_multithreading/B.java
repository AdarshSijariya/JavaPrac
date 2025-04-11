class Account {
    String acNum = "5678";
    String acType = "saving";
    private int balance = 50;

    synchronized int checkBalance() {
        return balance;
    }

    void withdraw(int amt) {
        synchronized(this) {
            if(balance >= amt) {
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace();}
                balance -= amt;
            } 
        }
    }

    String getAcNum() {
        return acNum;
    }

    String getAcType() {
        return acType;
    }
}

class B {
    static Account ac = new Account();
    public static void main(String[] args) {
        TThread t1 = new TThread(); 
        TThread t2 = new TThread();
        
        t1.setName("mohan");
        t2.setName("sohan");

        t1.start();
        t2.start();
    }
}

class TThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<5;i++) {
            B.ac.withdraw(10);
            System.out.println(t.getName() 
            + " - Balance After Transaction: " 
            + B.ac.checkBalance());
        }
    }
}