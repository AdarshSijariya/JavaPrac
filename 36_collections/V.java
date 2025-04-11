import java.util.TreeSet;
import java.util.PriorityQueue;

class V {
    public static void main(String[] args) {
        // TreeSet set = new TreeSet();
        PriorityQueue set = new PriorityQueue();

        System.out.println(set);        
    
        set.add("mohan");
        set.add("tohan");
        set.add("gohan");
        set.add("sohan");
        set.add("rohan");
        set.add("tohan");
        
        System.out.println(set);   

        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
    }
}
