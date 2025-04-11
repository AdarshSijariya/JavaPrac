abstract class X4 {
    abstract void pro();
    abstract void info();
}

class I extends X4 {
    void pro() {

    }
}



// I.java:6: error: I is not abstract and does not override abstract method info() in X4
// class I extends X4 {
// ^
// 1 error