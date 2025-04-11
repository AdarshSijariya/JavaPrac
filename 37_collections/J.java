import java.util.HashMap;

class J {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(7, 72);
        map.put(12, 98);
        map.put(5, 64);
        map.put(11, 87);
        map.put(9, 51);
        
        System.out.println(map);

        // Integer i = Integer.valueOf(64);
        Integer i = Integer.valueOf(5);
        System.out.println(map.containsValue(i));
    }
}