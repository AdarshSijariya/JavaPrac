enum CoffeeMugSize {
    SMALL(200,'S'),MEDIUM(450,'M'),LARGE(650,'L');

    private int ml;
    private char tag;

    CoffeeMugSize(int ml, char tag) {
        this.ml = ml;
        this.tag = tag;
    }

    public int getMl() {
        return ml;
    }

    public char getTag() {
        return tag;
    }
}

class R {
    public static void main(String[] args) {
        CoffeeMugSize[] arr = CoffeeMugSize.values();
        
        for(CoffeeMugSize size : arr) {
            System.out.println(size + " - " + size.getMl() + " - " + size.getTag());
        }

        // CoffeeMugSize size = CoffeeMugSize.SMALL;        
        // System.out.println(size + " - " + size.getMl() + " - " + size.getTag());
    }    
}
