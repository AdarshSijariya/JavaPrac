enum LassiMugSize {
    SMALL,MEDIUM,LARGE;

    int ml;

    LassiMugSize(int ml) {
        this.ml = ml;
    }
}

class Q {
    public static void main(String[] args) {
        LassiMugSize size = new LassiMugSize(200);
    }    
}



// Q.java:2: error: constructor LassiMugSize in enum LassiMugSize cannot be applied to given types;
//     SMALL,MEDIUM,LARGE;
//     ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// Q.java:2: error: constructor LassiMugSize in enum LassiMugSize cannot be applied to given types;
//     SMALL,MEDIUM,LARGE;
//           ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// Q.java:2: error: constructor LassiMugSize in enum LassiMugSize cannot be applied to given types;
//     SMALL,MEDIUM,LARGE;
//                  ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// Q.java:13: error: enum types may not be instantiated
//         LassiMugSize size = new LassiMugSize(200);
//                             ^
// 4 errors