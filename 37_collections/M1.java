import java.util.HashMap;
import java.util.Set;
import java.util.Map;

class M1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("sohan", 9);
        map.put("eohan", 15);
        
        Set set = map.entrySet();
        
        for(Object obj : set) {
            Map.Entry next = (Map.Entry)obj;
            System.out.println(next.getKey() + " : " + next.getValue());
        }
    }
}