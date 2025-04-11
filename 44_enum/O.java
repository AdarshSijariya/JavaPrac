class AAA {
    enum LassiMugSize {
        SMALL,MEDIUM,LARGE
    }
}

class O {
    public static void main(String[] args) {
        LassiMugSize size = LassiMugSize.LARGE;

        System.out.println(size);
    }    
}


// O.java:9: error: cannot find symbol
//         LassiMugSize size = LassiMugSize.LARGE;
//         ^
//   symbol:   class LassiMugSize
//   location: class O
// O.java:9: error: cannot find symbol
//         LassiMugSize size = LassiMugSize.LARGE;
//                             ^
//   symbol:   variable LassiMugSize
//   location: class O
// 2 errors