class I3 {
    I3(int... x) {
        for(int next : x) {
            System.out.println(next);
        }
    }    

    public static void main(String[] args) {
        Integer a1 = 120;
        Integer a2 = 130;
        Integer a3 = 140;
        Integer a4 = 150;
        Integer a5 = 160;
       
        Integer[] w = {a1, a2, a3, a4, a5};

        I3 i = new I3(w);
    }
}


// I3.java:17: error: constructor I3 in class I3 cannot be applied to given types;
//         I3 i = new I3(w);
//                ^
//   required: int[]
//   found: Integer[]
//   reason: varargs mismatch; Integer[] cannot be converted to int
// 1 error