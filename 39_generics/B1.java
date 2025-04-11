import java.util.ArrayList;

class B1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(12);
        list.add(true);
        list.add("hello");

        System.out.println(list);
    }    
}


//Generics is a compile time safety;

// B1.java:7: error: incompatible types: int cannot be converted to String
//         list.add(12);
//                  ^
// B1.java:8: error: incompatible types: boolean cannot be converted to String
//         list.add(true);
//                  ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors