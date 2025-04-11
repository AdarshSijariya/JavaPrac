import java.util.Hashtable;

class P {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<String, Integer>();
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("sohan", 9);
        map.put("eohan", 15);        
        
        System.out.println(map);
        
        map.put(null, 34);
        
        System.out.println(map);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//         at java.base/java.util.Hashtable.put(Hashtable.java:481)
//         at P.main(P.java:15)