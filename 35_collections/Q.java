import java.util.HashSet;

class Q {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        
        set.add("mohan");
        set.add("eohan");
        set.add("tohan");
        set.add("gohan");
        set.add("rohan");
        set.add("sohan");

        System.out.println(set);
        
        String str = new String("tohan");
        System.out.println(set.remove(str));
        
        System.out.println(set);
    }
}
