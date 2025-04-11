class P1 {
    private float y = 8.9f;

    static class X {
        private void pro() {
            System.out.println("parajit" + y);
        }
    }   
    
    public static void main(String[] args) {
        X x = new X();
        x.pro();
    }
}



// P1.java:6: error: non-static variable y cannot be referenced from a static context
//             System.out.println("parajit" + y);
//                                            ^
// 1 error