class C {
    C(int x) {

    }

    public static void main(String[] args) {
        new C();
    }    
}


// C.java:7: error: constructor C in class C cannot be applied to given types;
//         new C();
//         ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error