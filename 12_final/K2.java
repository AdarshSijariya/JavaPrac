class K2 {
    static final int y = 66;
    
    K2() {
        // y = 67;
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println(y);
    }
}



// K2.java:5: error: cannot assign a value to final variable y
//         y = 67;
//         ^
// 1 error