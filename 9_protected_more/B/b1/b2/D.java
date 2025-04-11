package b1.b2;

class D {
    public static void main(String[] args) {
        E x = new E();

        System.out.println(x.w);
    }
}



// b1\b2\D.java:7: error: w has protected access in A
//         System.out.println(x.w);
//                             ^
// 1 error