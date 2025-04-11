class O1 {
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
        // info("A", "B", "C", "D", "E", "F");
        info({"A", "B", "C"}, "D", "E", "F");
    }    
}



// O1.java:16: error: illegal start of expression
//         info({"A", "B", "C"}, "D", "E", "F");
//              ^
// O1.java:16: error: not a statement
//         info({"A", "B", "C"}, "D", "E", "F");
//               ^
// O1.java:16: error: ';' expected
//         info({"A", "B", "C"}, "D", "E", "F");
//                  ^
// O1.java:16: error: illegal start of expression
//         info({"A", "B", "C"}, "D", "E", "F");
//                             ^
// 4 errors