import java.util.TreeSet;

class Z {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(45);
        set.add(23);
        set.add(56);
        set.add(9);
        set.add(12);

        System.out.println(set.first());
        System.out.println(set.last());
    }
}
