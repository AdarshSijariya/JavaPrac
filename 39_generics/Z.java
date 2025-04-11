import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(13);
        list1.add(14);

        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(12.2f);
        list2.add(13.3f);
        list2.add(14.4f);

        process(list1, list2);
        process(list2, list1);
    }   
    
    static <M,N> void process(ArrayList<M> list1, ArrayList<N> list2) {
        // list.add("om");
        // list.add(true);

        System.out.println(list1);
        System.out.println(list2);
    }
}
