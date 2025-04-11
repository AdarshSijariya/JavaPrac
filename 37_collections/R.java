import java.util.TreeMap;

class R {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("eohan", 9);
        map.put("sohan", 15);        
        
        System.out.println(map);
    }
}