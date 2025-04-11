import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);
        
        map.put("mohan", 12);
        map.put("tohan", 7);
        map.put("gohan", 10);
        map.put("sohan", 9);
        map.put("eohan", 15);
        
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);
    }
}