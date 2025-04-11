import java.util.HashMap;

class H {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "mohan");
        map.put(12, "tohan");
        map.put(9, "gohan");
        map.put(15, "sohan");
        map.put(10, "eohan");
        
        System.out.println(map);

        // Integer i = Integer.valueOf(15);
        Integer i = Integer.valueOf(99);
        System.out.println(map.containsKey(i));
    }
}