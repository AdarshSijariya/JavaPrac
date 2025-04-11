interface R {
    int add(int x, int y);
}

class Q {
    public static void main(String[] args) {
        R r = (a,b) ->  a+b;
    
        // int result = r.add(12, 13);
        int result = r.add(1.2, 1.3);
    
        System.out.println(result);
    }    
}


// Q.java:10: error: incompatible types: possible lossy conversion from double to int
//         int result = r.add(1.2, 1.3);
//                            ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error