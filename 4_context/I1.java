class I1 {
    int q = 9;

    public static void main(String[] args) {
        System.out.println(I1.q);
    }
    
    void abc() {
        System.out.println(I1.q);
    }
}


// I1.java:5: error: non-static variable q cannot be referenced from a static context
//         System.out.println(I1.q);
//                              ^
// I1.java:9: error: non-static variable q cannot be referenced from a static context
//         System.out.println(I1.q);
//                              ^
// 2 errors