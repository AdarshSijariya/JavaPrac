import java.util.TreeSet;
import java.util.SortedSet;

class C {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(45);
        set.add(23);
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(23);
        set.add(19);
        set.add(37);
        set.add(49);

        // Integer val = set.ceiling(35);
        // Integer val = set.ceiling(45);
        Integer val = set.ceiling(59);

        System.out.println(val);
    }
}
