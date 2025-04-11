class N {
    int a = 9;

    void pro() {
        System.out.println("Jay");
    }

    class X {
        X() {
            System.out.println("Vijay");
        }
    }   
    
    public static void main(String[] args) {
        System.out.println(a);

        pro();

        new X();
    }
}



// N.java:15: error: non-static variable a cannot be referenced from a static context
//         System.out.println(a);
//                            ^
// N.java:17: error: non-static method pro() cannot be referenced from a static context
//         pro();
//         ^
// N.java:19: error: non-static variable this cannot be referenced from a static context
//         new X();
//         ^
// 3 errors
