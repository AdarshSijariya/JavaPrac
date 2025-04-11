import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(12);
        l1.add(13);
        l1.add(14);

        ArrayList<Float> l2 = new ArrayList<Float>();
        l2.add(2.3f);
        l2.add(4.8f);
        l2.add(7.9f);


        process(l1);
        process(l2);
    }   
    
    static void process(ArrayList<Number> x) {
        System.out.println(x);
    }
}

// J.java:16: error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Number>
//         process(l1);
//                 ^
// J.java:17: error: incompatible types: ArrayList<Float> cannot be converted to ArrayList<Number>
//         process(l2);
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors
