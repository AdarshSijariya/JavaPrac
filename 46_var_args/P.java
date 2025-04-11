class P {
    static void pro(String[] ar) {
        for(String x : ar) {
            System.out.println(x);
        }
    }

    static void pro(String... ar) {
        for(String x : ar) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // pro(new String[] {"A","B","C"});    
        // pro("A","B","C");    
    }
}


// P.java:8: error: cannot declare both pro(String...) and pro(String[]) in P
//     static void pro(String... ar) {
//                 ^
// 1 error