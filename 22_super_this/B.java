class X2 {
    int a = 45;    
}

class B extends X2 {
    int a = 32;

    static void pro() {
        int a = 2;

        System.out.println(a);
        System.out.println(super.a);
        System.out.println(this.a);
    }
}


// B.java:12: error: non-static variable super cannot be referenced from a static context
//         System.out.println(super.a);
//                            ^
// B.java:13: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this.a);
//                            ^
// 2 errors