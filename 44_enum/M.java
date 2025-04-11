class M {
    void pro() {
        enum LassiMugSize {
            SMALL,MEDIUM,LARGE
        }

        LassiMugSize size = LassiMugSize.LARGE;
     
        System.out.println(size);
    }

    public static void main(String[] args) {
        new M().pro();
    }    
}