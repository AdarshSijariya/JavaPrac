class M1 {
    static void info(float x, String... w) {
        System.out.println(x);
        System.out.println("~~~~~~~~~");

        for(String next : w) {
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        // info('A', "B", "C", "D", "E", "F");
        info("B", "C", "D", "E", "F");
    }    
}


// M1.java:13: error: incompatible types: String cannot be converted to float
//         info("B", "C", "D", "E", "F");
//              ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error