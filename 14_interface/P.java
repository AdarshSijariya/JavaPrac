interface U2 {
    int y = 999;
}

class P {
    public static void main(String[] args) {
        System.out.println(U2.y);

        U2.y = 4555;

        System.out.println(U2.y);
    }
}



// P.java:9: error: cannot assign a value to final variable y
//         U2.y = 4555;
//           ^
// 1 error