import java.util.HashMap;

class F {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "mohan");
        map.put(12, "eohan");
        map.put(null, "gohan");
        map.put(15, "sohan");
        
        System.out.println(map);
        
        map.put(null, "ganesh");
        
        System.out.println(map);
    }
}