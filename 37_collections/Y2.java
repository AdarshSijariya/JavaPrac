import java.util.ArrayList;

class Y2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(45);
        list.add(12);
        list.add(9);
        list.add(67);

        System.out.println(list);

        Integer[] tmp = new Integer[0];
        Integer[] arr = list.toArray(tmp);

        for(Integer next : arr) {
            System.out.println(next.intValue());
        }
    }    
}