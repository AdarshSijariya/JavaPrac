class D1 {
    public static void main(String[] args) {
        pro();
    }   
    
    static void pro(String... x) {
        // System.out.println(x);
        System.out.println(x.length);
    }

    // static void pro(String[] x) {
    //     // System.out.println(x);
    //     System.out.println(x.length);
    // }
    // D1.java:3: error: method pro in class D1 cannot be applied to given types;
    //         pro();
    //         ^
    // required: String[]
    // found: no arguments
    // reason: actual and formal argument lists differ in length
    // 1 error
}
