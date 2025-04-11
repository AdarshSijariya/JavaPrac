class K {
    static void pro(float... x, int... w) {
        //----
    }

    public static void main(String[] args) {
        pro(2.3f, 3.4f, 5.6f, 20, 30, 40);
    }    
}



// K.java:2: error: varargs parameter must be the last parameter
//     static void pro(float... x, int... w) {
//                              ^
// 1 error