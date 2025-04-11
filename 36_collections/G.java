import java.util.TreeSet;

class G {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        System.out.println(set.isEmpty());        
        System.out.println(set.size());        
        System.out.println(set);        
        
        set.add(34);
        set.add(56);
        set.add(12);
        set.add(9);
        set.add(17);
        
        System.out.println(set.isEmpty());        
        System.out.println(set.size());        
        System.out.println(set);        
    }
}
