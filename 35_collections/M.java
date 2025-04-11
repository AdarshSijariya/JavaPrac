import java.util.LinkedList;

class M {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        
        list.add(12);
        list.add(57);
        list.add(9);
        list.add(34);

        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        
        System.out.println(list);
    }
}