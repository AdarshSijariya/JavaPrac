import java.util.HashMap;
import java.util.Set;
import java.util.Map;

class M2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("mmohan", 12);
        map.put("ttohan", 7);
        map.put("ggohan", 10);
        map.put("ssohan", 9);
        map.put("eeohan", 15);
        
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        
        for(Map.Entry next : set) {
            System.out.println(next.getKey() + " : " + next.getValue());
        }
    }
}