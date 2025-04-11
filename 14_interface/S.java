interface AB {
    void info();
    void pro();
}


class S implements AB {
    // public void pro() {

    // }      
}


// S.java:7: error: S is not abstract and does not override abstract method pro() in AB
// class S implements AB {
// ^
// 1 error


// S.java:7: error: S is not abstract and does not override abstract method info() in AB
// class S implements AB {
// ^
// 1 error