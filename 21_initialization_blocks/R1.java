class R1 {
    
    static {
        System.out.println(y);
    }

    static int y = 23;

    public static void main(String[] args) {
        System.out.println("main");
    }
}


// R1.java:4: error: illegal forward reference
//         System.out.println(y);
//                            ^
// 1 error