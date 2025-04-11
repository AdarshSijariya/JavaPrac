class N1 {
    static int a = 9;

    static void pro() {
        System.out.println("Jay");
    }

    static class X {
        X() {
            System.out.println("Vijay");
        }
    }   
    
    public static void main(String[] args) {
        System.out.println(a);

        pro();

        new X();
    }
}
