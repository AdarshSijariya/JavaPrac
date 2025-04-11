class AAA {
    enum LassiMugSize {
        SMALL,MEDIUM,LARGE
    }
}

class O1 {
    public static void main(String[] args) {
        AAA.LassiMugSize size = AAA.LassiMugSize.LARGE;

        System.out.println(size);
    }    
}