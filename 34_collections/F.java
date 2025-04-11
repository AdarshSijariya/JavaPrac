import java.util.ArrayList;

class F {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list);
        System.out.println(list.size());
        
        list.add(12);
        list.add(78);
        System.out.println(list);
        System.out.println(list.size());
        
        list.add(34);
        list.add(12);
        list.add(57);
        System.out.println(list);
        System.out.println(list.size());
        
        list.add(2);
        list.add(12);
        System.out.println(list);
        System.out.println(list.size());
    }    
}


//ArrayList is a growable array