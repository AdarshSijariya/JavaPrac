class A {
    static void pro(int a, int b) {
        System.out.println(a + " " + b);
    } 

    public static void main(String[] args) {
        pro();
    }
}


// A.java:7: error: method pro in class A cannot be applied to given types;
//         pro();
//         ^
//   required: int,int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error