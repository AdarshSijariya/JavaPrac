import java.util.HashSet;

class T {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        
        
        set.add(34);
        set.add(12);
        set.add(9);
        set.add(2);
        set.add(45);
        set.add(78);

        System.out.println(set);

        Integer i = Integer.valueOf(2);

        System.out.println(set.remove(i));
        System.out.println(set);
    }
}
