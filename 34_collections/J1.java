import java.util.ArrayList;

class J1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        
        list.add(12);
        list.add(78);
        list.add(34);
        list.add(12);
        list.add(57);
        list.add(2);
        list.add(12);
        
        System.out.println(list);

        // list.remove(12);
        Integer i = Integer.valueOf(12);
        list.remove(i);

        System.out.println(list);
    }    
}


