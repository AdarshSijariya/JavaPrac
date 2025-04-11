import java.util.ArrayList;
import java.util.Iterator;

class V {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("rohan");
        list.add("sohan");
        list.add("gohan");
        list.add("tohan");

        Iterator itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().toUpperCase());
        }
    }
}


// V.java:17: error: cannot find symbol
//             System.out.println(itr.next().toUpperCase());
//                                          ^
//   symbol:   method toUpperCase()
//   location: class Object
// Note: V.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
