import java.util.Hashtable;

class P1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<String, Integer>();
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("sohan", 9);
        map.put("eohan", 15);        
        
        System.out.println(map);
        
        map.put("abc", null);
        
        System.out.println(map);
    }
}


// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:476)
//         at P1.main(P1.java:15)