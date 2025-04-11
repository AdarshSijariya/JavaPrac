class B {
    static void pro(int a, int b) {
        System.out.println(a + " " + b);
    } 

    public static void main(String[] args) {
        int[] x = {12, 13};
        
        pro(x);
    }
}


// B.java:9: error: method pro in class B cannot be applied to given types;
//         pro(x);
//         ^
//   required: int,int
//   found: int[]
//   reason: actual and formal argument lists differ in length
// 1 error
