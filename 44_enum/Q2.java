enum LassiMugSize {
    SMALL(200),MEDIUM(500),LARGE(750);

    private int ml;

    LassiMugSize(int ml) {
        this.ml = ml;
    }

    int getSize() {
        return ml; 
    }
}

class Q2 {
  public static void main(String[] args) {
      LassiMugSize[] sizes = LassiMugSize.values();

      for(LassiMugSize size : sizes) {
          // System.out.println(size + " - " + size.ml);
          System.out.println(size + " - " + size.getSize());
      }   
  }
}