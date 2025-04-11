class X {
    public static void main(String[] args) {
        String[][] x = new String[3][2];

        System.out.println(x.length);

        System.out.println(x[0].length);
        System.out.println(x[1].length);
        System.out.println(x[2].length);

        // System.out.println(x[0][0].length);
    }    
}



// X.java:11: error: cannot find symbol
//         System.out.println(x[0][0].length);
//                                   ^
//   symbol:   variable length
//   location: class String
// 1 error
