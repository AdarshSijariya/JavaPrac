import java.util.LinkedHashMap;
import java.util.HashMap;

class Q {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        // HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("aohan", 12);
        map.put("bohan", 7);
        map.put("cohan", 10);
        map.put("dohan", 9);
        map.put("eohan", 15);        
        
        System.out.println(map);
    }
}