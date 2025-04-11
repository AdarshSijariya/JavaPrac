import java.util.Hashtable;

class O {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<String, Integer>();
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("sohan", 9);
        map.put("eohan", 15);        
        
        System.out.println(map);
        map.put("gohan", 34);
        System.out.println(map);
    }
}
