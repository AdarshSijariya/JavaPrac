import java.util.LinkedList;

class M1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.offer(9);
        list.offer(23);
        list.offer(51);
        list.offer(7);

        System.out.println(list);

        // System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        
        System.out.println(list);
    }
}