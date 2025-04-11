import java.util.ArrayList;

class Y1 {
    <Z> Y1(ArrayList<Z> list) {

    }   
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(13);
        list1.add(14);

        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(12.2f);
        list2.add(13.3f);
        list2.add(14.4f);

        Y a = new Y(list1);
        Y b = new Y(list2);
    }
}
