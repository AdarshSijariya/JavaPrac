import java.util.ArrayList;

class L {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        
        list.add(12);
        list.add(78);
        list.add(34);
        list.add(12);
        list.add(57);
        list.add(12);
        
        System.out.println(list);

        int x = list.get(0);

        System.out.println(list);
    }    
}



// L.java:17: error: incompatible types: Object cannot be converted to int
//         int x = list.get(0);
//                         ^
