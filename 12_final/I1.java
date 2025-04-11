class I1 {
    final int x;
    final int y = 9;
    
    public static void main(String[] args) {
        I1 i = new I1();

        System.out.println(i.x);
        System.out.println(i.y);
    }
}



// I1.java:2: error: variable x not initialized in the default constructor
//     final int x;
//               ^
// 1 error