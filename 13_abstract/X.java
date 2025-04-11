abstract class S1 {
    abstract void pro();
}

abstract class S2 extends S1 {

}

class X extends S2 {
    
}



// X.java:9: error: X is not abstract and does not override abstract method pro() in S1
// class X extends S2 {
// ^
// 1 error