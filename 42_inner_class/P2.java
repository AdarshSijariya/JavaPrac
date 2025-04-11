class P2 {
    private static float y = 1.2f;

    static class X {
        private void pro() {
            System.out.println("aparajit" + y);
        }
    }   
    
    public static void main(String[] args) {
        X x = new X();
        x.pro();
    }
}