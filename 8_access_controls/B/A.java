class A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);
    }
}


// A.java:5: error: y has private access in B
//         System.out.println(x.y);
//                             ^
// 1 error