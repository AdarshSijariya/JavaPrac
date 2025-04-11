import java.util.ArrayList;
import java.util.Collections;

class Q1 {
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

        // int searchIndex = Collections.binarySearch(list, "mahesh");
        // int searchIndex = Collections.binarySearch(list, "ganesh");
        int searchIndex = Collections.binarySearch(list, "ramesh");

        System.out.println(searchIndex);
    }
}
