import java.util.HashMap;

class M {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("sohan", 9);
        map.put("eohan", 15);
        
        
        for(Object obj : map) {
            System.out.println(obj);
        }
    }
}



// M.java:14: error: for-each not applicable to expression type
//         for(Object obj : map) {
//                          ^
//   required: array or java.lang.Iterable
//   found:    HashMap<String,Integer>
// 1 error