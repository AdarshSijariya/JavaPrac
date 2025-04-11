import java.util.HashMap;

class G {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        System.out.println(map.put(7, "mohan"));
        System.out.println(map.put(12, "sohan"));
        System.out.println(map.put(9, "eohan"));
        
        
        System.out.println(map);
        
        System.out.println(map.put(12, "hohan"));
        
        
        System.out.println(map);
    }
}