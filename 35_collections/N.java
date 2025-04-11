import java.util.HashSet;

class N {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add(34);
        set.add(12);
        set.add(9);
        set.add(2);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
