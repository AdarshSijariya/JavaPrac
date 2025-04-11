class L {
    public static void main(String[] args) {
        pro(23, 34, 45, 4.5f);
    }

    static void pro(int... x, float w) {

    }
}


// L.java:6: error: varargs parameter must be the last parameter
//     static void pro(int... x, float w) {
//                            ^
// 1 error