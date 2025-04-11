/*final*/ class A2 {
    void aaa() {
        System.out.println("aaa in A1");
    }    

    void bbb() {
        System.out.println("bbb in A1");
    }    
    
    void ccc() {
        System.out.println("ccc in A1");
    }     
}

class B2 extends A2 {

}



// A2.java:15: error: cannot inherit from final A2
// class B2 extends A2 {
//                  ^
// 1 error