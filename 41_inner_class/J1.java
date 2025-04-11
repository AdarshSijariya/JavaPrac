class J1 {
    int u = 23;

    class X {
        void pro() {
            System.out.println(u);
        }
    }   
    
    public static void main(String[] args) {
        new J1().new X().pro();
    }
}
