import java.util.ArrayList;
import java.util.Collections;

class Q {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("ganesh");
        list.add("dinesh");
        list.add("suresh");
        list.add("mahesh");
        list.add("ramesh");

        System.out.println(list);

        // int searchIndex = Collections.binarySearch(list, "mahesh");
        // int searchIndex = Collections.binarySearch(list, "ganesh");
        int searchIndex = Collections.binarySearch(list, "ramesh");

        System.out.println(searchIndex);
    }
}
