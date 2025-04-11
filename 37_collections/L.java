import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class L {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "mohan");
        map.put(12, "tohan");
        map.put(9, "gohan");
        map.put(15, "sohan");
        map.put(10, "eohan");
        
        System.out.println(map);

        Set set = map.keySet();

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()) {
            Integer nextKey = itr.next();

            System.out.println(nextKey + " - " + map.get(nextKey));
        }
    }
}