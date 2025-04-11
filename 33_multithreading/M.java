import java.util.Scanner;

class M {
    static Circle c = new Circle();
    public static void main(String[] args) {
        ProducerThread pt = new ProducerThread();
        ConsumerThread ct = new ConsumerThread();

        pt.setName("Producer");
        ct.setName("Consumer");

        pt.start();
        ct.start();
    }
}

class ProducerThread extends Thread {   

    public void run() {
        while(true) {
            M.c.setRadius();
        }
    }
}

class ConsumerThread extends Thread {
    public void run() {
        while(true) {
            M.c.readRadius();
        }
    }
}

class Circle {
    private int radius;
    static Scanner sc = new Scanner(System.in);

    public synchronized void readRadius() {
        if(radius != 0) {
            System.out.println("Consumer reading the radius: " + radius);
            radius = 0;
            notify();
        } else {
            try {wait();} catch(InterruptedException e) {e.printStackTrace();}
        }
    }

    public synchronized void setRadius() {        
        if(radius == 0) {
            System.out.print("Enter New Radius: ");
            radius = sc.nextInt();            
            notify();
        } else {
            try {wait();} catch(InterruptedException e) {e.printStackTrace();}            
        }
    }
}
