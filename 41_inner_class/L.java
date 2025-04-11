class X1 {
    private int y = 90;
}

class L extends X1 {
    public static void main(String[] args) {
        L t = new L();
        System.out.println(t.y);
    }    
}


// L.java:8: error: y has private access in X1
//         System.out.println(t.y);
//                             ^
// 1 error