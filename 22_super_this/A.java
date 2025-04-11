class X1 {
    int a = 23;
}

class A extends X1 {
    int a = 12;

    
    static {
        int a = 8;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}



// A.java:11: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this.a);
//                            ^
// A.java:12: error: non-static variable super cannot be referenced from a static context
//         System.out.println(super.a);
//                            ^
// 2 errors