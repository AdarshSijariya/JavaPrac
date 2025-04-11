class O {
    static void info(String[] ar1, String... ar2) {
        for(String nx : ar1) {
            System.out.println(nx);
        }
        
        System.out.println(" ~~~~~~~~~~~~~~~~~~~ ");

        for(String nx : ar2) {
            System.out.println(nx);
        }
    }

    public static void main(String[] args) {
        info("A", "B", "C", "D", "E", "F");
    }    
}


// O.java:15: error: incompatible types: String cannot be converted to String[]
//         info("A", "B", "C", "D", "E", "F");
//              ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error