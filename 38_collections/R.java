import java.util.ArrayList;
import java.util.Collections;

class R {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("ganesh");
        list.add("dinesh");
        list.add("suresh");
        list.add("mahesh");
        list.add("ramesh");

        System.out.println(list);

        Collections.sort(list);
        
        System.out.println(list);

        int searchIndex = Collections.binarySearch(list, "namesh");
        // int searchIndex = Collections.binarySearch(list, "amesh");
        // int searchIndex = Collections.binarySearch(list, "smesh");
        
        System.out.println(searchIndex);
    }
}
