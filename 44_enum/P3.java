class P3 {
    enum LassiMugSize {
        SMALL,MEDIUM,LARGE
    }

    public static void main(String[] args) {
        LassiMugSize x = LassiMugSize.MEDIUM;
        
        switch(x) {
            case SMALL:
                System.out.println("A");
                break;
            case LARGE:
                System.out.println("B");
                break;
            case MEDIUM:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
    }    
}