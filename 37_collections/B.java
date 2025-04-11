import java.util.HashMap;

class B {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);
        
        map.put(7, "mohan");
        map.put(12, "tohan");
        map.put(9, "gohan");
        map.put(15, "sohan");
        map.put(10, "eohan");
        
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);
    }
}