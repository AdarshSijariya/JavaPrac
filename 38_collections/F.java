import java.util.TreeMap;

class F {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        
        map.put( "mohan", 23);
        map.put( "tohan", 12);
        map.put( "gohan", 7);
        map.put("sohan", 19);
        map.put( "eohan", 11);       
        
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}