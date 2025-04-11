import java.util.HashSet;

class R {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        
        set.add("mohan");
        set.add("eohan");
        set.add("tohan");
        set.add("gohan");
        set.add("rohan");
        set.add("sohan");

        for(Object next : set) {
            System.out.println(next);
        }
    }
}
