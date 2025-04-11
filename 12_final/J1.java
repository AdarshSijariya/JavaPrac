class J1 {
    final int y = 8;
    
    public static void main(String[] args) {
        J1 j = new J1();

        System.out.println(j.y);

        j.y = 11;

        System.out.println(j.y);
    }
}


// J1.java:9: error: cannot assign a value to final variable y
//         j.y = 11;
//          ^
// 1 error