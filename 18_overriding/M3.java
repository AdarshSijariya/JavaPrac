class A {
    protected void pro() {  //protected

    }
}

class M3 extends A {
    private void pro() {  //private
        
    }
}



// M3.java:8: error: pro() in M3 cannot override pro() in A
//     private void pro() {  //private
//                  ^
//   attempting to assign weaker access privileges; was protected
// 1 error
