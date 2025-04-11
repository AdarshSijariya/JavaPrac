import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        System.out.println(list);

        list.add(2, 99); //insert

        System.out.println(list);
    }
}