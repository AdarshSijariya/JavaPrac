import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        
        list.add(12);
        list.add(78);
        list.add(34);
        list.add(12);
        list.add(57);
        // list.add(2);
        list.add(12);
        
        System.out.println(list);

        boolean exists = list.contains(2);

        System.out.println(exists);
        System.out.println(list);
    }    
}


