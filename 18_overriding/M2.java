class A {
    protected void pro() {  //protected

    }
}

class M2 extends A {
    void pro() {  //default
        
    }
}


// M2.java:8: error: pro() in M2 cannot override pro() in A
//     void pro() {  //default
//          ^
//   attempting to assign weaker access privileges; was protected
// 1 error