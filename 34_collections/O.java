import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(13);
        list.add(14);
    
        list.add('A');
    }
}


// O.java:11: error: incompatible types: char cannot be converted to Integer
//         list.add('A');
//                  ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error