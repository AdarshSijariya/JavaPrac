import java.util.HashMap;

class E {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "mohan");
        map.put(12, null);
        map.put(null, "gohan");
        map.put(15, "sohan");
        map.put(10, null);
        
        System.out.println(map);
    }
}