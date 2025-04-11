import java.util.ArrayList;

class L1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        
        list.add(55);
        list.add(78);
        list.add(34);
        list.add(12);
        list.add(57);
        list.add(12);
        
        System.out.println(list);

        int x = (Integer)list.get(0);
        // int x = (Integer)list.remove(0);

        System.out.println(list);
        System.out.println(x);
    }    
}