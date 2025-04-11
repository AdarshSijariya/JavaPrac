import java.util.ArrayList;

class Y1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add(45);
        list.add(12);
        list.add(9);
        list.add(67);

        System.out.println(list);

        Integer[] tmp = new Integer[0];
        Integer[] arr = list.toArray(tmp);
    }    
}


// Y1.java:15: error: incompatible types: Object[] cannot be converted to Integer[]
//         Integer[] arr = list.toArray(tmp);
//                                     ^
// Note: Y1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
