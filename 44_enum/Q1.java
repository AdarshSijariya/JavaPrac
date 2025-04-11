enum LassiMugSize {
    SMALL(200),MEDIUM(500),LARGE(750);

    int ml;

    LassiMugSize(int ml) {
        this.ml = ml;
    }
}

class Q1 {
    public static void main(String[] args) {
        LassiMugSize[] sizes = LassiMugSize.values();

        for(LassiMugSize size : sizes) {
            System.out.println(size + " - " + size.ml);
        }   
    }
}