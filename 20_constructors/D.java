class D {
    D(int x, float y) {

    }

    public static void main(String[] args) {
        new D(true, 20);
    }    
}



// D.java:7: error: incompatible types: boolean cannot be converted to int
//         new D(true, 20);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error