import java.util.HashSet;

class O {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set);

        set.add(34);
        set.add(12);
        set.add(9);
        set.add(12);
        set.add(2);
        set.add(12);

        System.out.println(set);
    }
}
