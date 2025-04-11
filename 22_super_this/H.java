class Y2 { 
    Y2() {
        System.out.println("----- Y2() ----start");
        // System.out.println(this);
        System.out.println(super);
        System.out.println("----- Y2() ----end");
    }
}

class H extends Y2 {
    H() {
        System.out.println("----- G() ----start");
        System.out.println(super);
        System.out.println("----- G() ----end");
    }
    public static void main(String[] args) {
        H g = new H();
        
        System.out.println("----- main() ----start");
        System.out.println(g);
        System.out.println("----- main() ----end");
    }
}



// H.java:5: error: '.' expected
//         System.out.println(super);
//                                 ^
// H.java:13: error: '.' expected
//         System.out.println(super);
//                                 ^
// 2 errors