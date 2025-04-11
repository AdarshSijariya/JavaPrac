class P {
    public static void main(String[] args) {
        final int y;   //uninitialized

        y = 999;

        y = 22;

        System.out.println(y);
    }    
}



// P.java:7: error: variable y might already have been assigned
//         y = 22;
//         ^
// 1 error