import java.util.HashSet;
import java.util.Iterator;

class S {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        
        set.add("mohan");
        set.add("eohan");
        set.add("tohan");
        set.add("gohan");
        set.add("rohan");
        set.add("sohan");

        Iterator itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
