import java.util.ArrayList;

class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        
        list.add(12);
        list.set(0, 100);
        list.remove(0);
    }
}