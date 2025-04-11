class Student {
    public static void main(String[] x) {
        Pen pen = new Pen();

        pen.write(); //Access through Instantiation
    }
}

class Pen {
    void write() {
        System.out.println("Write...");
    }
}