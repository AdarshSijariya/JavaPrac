import java.util.PriorityQueue;

class U1 {
    public static void main(String[] args) {
        PriorityQueue set = new PriorityQueue();
        
        set.add(34);
        set.add(56);
        set.add(12);
        set.add(9);
        set.add(17);
        set.add(34);

        System.out.println(set);        
        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
    }
}
