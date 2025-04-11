class Student extends Pen {
    static public void main(String[] args) {
        Student x = new Student();

        x.write(); //Access through Inheritence
    }
}

class Pen {
    void write() {
        System.out.println("Write some thing ....");
    }
}