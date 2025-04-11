import java.util.ArrayList;
import java.util.Collections;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(23);
        list.add(56);
        list.add(9);
        list.add(34);
        list.add(18);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
