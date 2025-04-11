import java.util.TreeSet;
import java.util.SortedSet;

class B {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(45);
        set.add(23);
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(23);
        set.add(19);
        set.add(37);
        set.add(49);

        // SortedSet tmp = set.tailSet(39);
        // SortedSet tmp = set.tailSet(23);
        SortedSet tmp = set.tailSet(59);

        System.out.println(tmp);
    }
}
