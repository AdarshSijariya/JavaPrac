import java.util.LinkedList;

class M2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push("mohan");
        list.push("rohan");
        list.push("tohan");
        list.push("gohan");
        list.push("sohan");

        System.out.println(list);
        
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println(list);
    }
}
