interface V2 {
    void pro();
}

class L1 implements V2 {
    void pro() {

    }  
}


// L1.java:6: error: pro() in L1 cannot implement pro() in V2
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error

