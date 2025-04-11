enum LassiMugSize {
    SMALL,MEDIUM,LARGE
}

class J {
    public static void main(String[] args) {
        // LassiMugSize size = LassiMugSize.LARGE;
        LassiMugSize size = LassiMugSize.HUGE;

        System.out.println(size);
    }    
}



// J.java:8: error: cannot find symbol
//         LassiMugSize size = LassiMugSize.HUGE;
//                                         ^
//   symbol:   variable HUGE
//   location: class LassiMugSize
// 1 error