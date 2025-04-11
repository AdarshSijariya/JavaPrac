import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(45);
        list.add(12);
        list.add(9);
        list.add(67);

        System.out.println(list);

        Object[] arr = list.toArray();

        for(Object obj : arr) {
            System.out.println(obj.intValue());
            //or
            // System.out.println(((Integer)obj).intValue());
        }
    }    
}
