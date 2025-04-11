import java.util.ArrayList;

class T1 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(150);
        list.add(160);


        for(Integer next : list) {
            System.out.println(next); 
        }

        System.out.println("---------------");
        System.out.println(list);
    }
}


// T1.java:15: error: incompatible types: Object cannot be converted to Integer
//         for(Integer next : list) {
//                            ^
// Note: T1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
