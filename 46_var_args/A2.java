class A2 {
    static void pro(int a, int b) {
        System.out.println(a + " " + b);
    } 

    public static void main(String[] args) {
        pro(12, 13, 14);
    }
}



// A2.java:7: error: method pro in class A2 cannot be applied to given types;
//         pro(12, 13, 14);
//         ^
//   required: int,int
//   found: int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error