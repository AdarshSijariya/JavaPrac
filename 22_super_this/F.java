class X6 {
    static void pro() {
        System.out.println("pro in X6");
    }
}

class F extends X6 {
    static void pro() {
        System.out.println("pro in F");
    }

    public static void main(String[] args) {
        super.pro();
        this.pro();
    }
}


// F.java:13: error: non-static variable super cannot be referenced from a static context
//         super.pro();
//         ^
// F.java:14: error: non-static variable this cannot be referenced from a static context
//         this.pro();
//         ^
// 2 errors
