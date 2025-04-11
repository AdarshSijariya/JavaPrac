class K {
    public static void main(String[] args) {
        char[] x = new char[7];

        System.out.println(x.length);

        x.length = 3;

        System.out.println(x.length);
    }    
}


// K.java:7: error: cannot assign a value to final variable length
//         x.length = 3;
//          ^
// 1 error
