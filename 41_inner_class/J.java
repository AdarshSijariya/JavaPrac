class J {
    class X {
        int t = 90;
    }

    public static void main(String[] args) {
        X x = new J().new X();

        System.out.println(x.t);
    }    
}
