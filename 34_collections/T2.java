import java.util.ArrayList;

class T2 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(150);
        list.add(160);

        for(Object next : list) {
            System.out.println(next); 
        }

        System.out.println("---------------");
        System.out.println(list);
    }
}
