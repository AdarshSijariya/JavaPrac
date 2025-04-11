class U {
    int y = 90;
    
    static {
        System.out.println(y);
    }
}


// U.java:5: error: non-static variable y cannot be referenced from a static context
//         System.out.println(y);
//                            ^
// 1 error