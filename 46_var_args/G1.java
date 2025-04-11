class G1 {
    public static void main(String[] args) {
        byte x = 23;
        short y = 45;
        int z = 9;
        char t = 'A';
        long q = 5;

        pro(x, y, z, t, q);
    }   
    
    static void pro(int... x) {
        for(int next : x) {
            System.out.println(next + " ~~");
        }
    }
}


// G1.java:9: error: method pro in class G1 cannot be applied to given types;
//         pro(x, y, z, t, q);
//         ^
//   required: int[]
//   found: byte,short,int,char,long
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error
