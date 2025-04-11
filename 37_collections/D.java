import java.util.HashMap;

class D {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "mohan");
        map.put(12, "tohan");
        map.put(9, "gohan");
        map.put(15, "sohan");
        map.put(10, "eohan");
        
        System.out.println(map);

        Integer x = Integer.valueOf(9);
        // Integer x = Integer.valueOf(99);
        
        System.out.println(map.remove(x));
        
        System.out.println(map);
    }
}