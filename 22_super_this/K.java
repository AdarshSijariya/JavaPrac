class W {
    W(int y) {
        System.out.println("W() " + y);
    }
}

class K extends W {
    /*static*/ int golu = 9;
    
    K() {
        super(golu);

        System.out.println("K()");
    }   
    
    public static void main(String[] args) {
        K x = new K();
        System.out.println("main()");
    }
}
