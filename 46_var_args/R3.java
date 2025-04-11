class R3 {
    static void abc(int...[] x) {
        for(int[] nx : x) {
            for(int mx : nx) {
                System.out.print(mx + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] x = {{1,2,3,4},{5,6,7},{8,9,10,11,12}};
        abc(x);
    }    
}


// R3.java:2: error: <identifier> expected
//     static void abc(int...[] x) {
//                           ^
// R3.java:2: error: ',', ')', or '[' expected
//     static void abc(int...[] x) {
//                             ^
// 2 errors