package b1;

import b1.b2.E;

class Z extends E {
    public static void main(String[] args) {
        E x = new E();
        // System.out.println(x.w);     // NOT OK

        Z y = new Z();
        System.out.println(y.w);
    }
}


// b1\Z.java:8: error: w has protected access in A
//         System.out.println(x.w);
//                             ^
// 1 error