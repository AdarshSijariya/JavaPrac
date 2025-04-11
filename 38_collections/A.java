import java.util.TreeSet;
import java.util.SortedSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(45);
        set.add(23);
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(23);
        set.add(19);

        // SortedSet tmp = set.headSet(32);
        // SortedSet tmp = set.headSet(23);
        SortedSet tmp = set.headSet(5);

        System.out.println(tmp);
    }
}
