class C1 {
    static void pro(int[] x) {
        for(int next : x) {
            System.out.println(next);
        }
    } 

    public static void main(String[] args) {
        // int[] x = {12, 13, 14, 15, 16};
        
        pro(12, 13, 14, 15);
    }
}



// C1.java:11: error: method pro in class C1 cannot be applied to given types;
//         pro(12, 13, 14, 15);
//         ^
//   required: int[]
//   found: int,int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error