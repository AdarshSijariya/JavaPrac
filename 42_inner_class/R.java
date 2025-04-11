class R {
    class X {

    }   
    
    static class Y {

    }

    public static void main(String[] args) {
        X x = new R().new X();

        Y y1 = new Y();
        Y y2 = new R.Y();
    }
}
