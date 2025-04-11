import java.util.ArrayList;
import java.util.Set;

class Z1<Y> {
    public static void main(String[] args) {
        Z1<ArrayList<Integer>> obj = new Z1<ArrayList<Integer>>();
        System.out.println(obj);

        Z1<ArrayList<Set<Integer>>> obj1 = new Z1<ArrayList<Set<Integer>>>();
        System.out.println(obj1);
    }
}
