class O {
    class X {
        int g = 7;
    }    

    public static void main(String[] args) {
        O s = new O();

        X x = s.new X();

        // System.out.println(s.g);  //not ok
        System.out.println(x.g);   //ok
    }
}
