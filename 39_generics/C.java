import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(13);
        x.add(14);

        Integer i = x.get(0);
    }
}


// C.java:11: error: incompatible types: Object cannot be converted to Integer
//         Integer i = x.get(0);
//                          ^
// Note: C.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
