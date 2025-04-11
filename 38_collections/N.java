import java.util.ArrayList;
import java.util.Collections;

class N {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("ganesh");
        list.add("dinesh");
        list.add("suresh");
        list.add("mahesh");
        list.add("ramesh");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
