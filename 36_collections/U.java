import java.util.PriorityQueue;

class U {
    public static void main(String[] args) {
        PriorityQueue set = new PriorityQueue();

        System.out.println(set.isEmpty());        
        System.out.println(set.size());        
        System.out.println(set);        
        
        set.add(34);
        set.add(56);
        set.add(12);
        set.add(9);
        set.add(17);
        set.add(34);
        
        System.out.println(set.isEmpty());        
        System.out.println(set.size());        
        System.out.println(set);        
    }
}
