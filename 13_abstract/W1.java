abstract class M2 {
    abstract void pro();
}


class W1 extends M2 {
    public static void main(String[] args) {
        W1 x = new W1();

        x.pro();
    }
}


// W1.java:6: error: W1 is not abstract and does not override abstract method pro() in M2
// class W1 extends M2 {
// ^
// 1 error