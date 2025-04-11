class A {
    void pro() {    //default

    }
}

class L3 extends A {
    private void pro() {   //private

    }         
}



// L3.java:8: error: pro() in L3 cannot override pro() in A
//     private void pro() {   //private
//                  ^
//   attempting to assign weaker access privileges; was package
// 1 error