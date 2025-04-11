class A {
    protected static void pro() {

    }
}
class S extends A {
    static /*protected*/ void pro() {
        
    }
}


// S.java:7: error: pro() in S cannot override pro() in A
//     static /*protected*/ void pro() {
//                               ^
//   attempting to assign weaker access privileges; was protected
// 1 error