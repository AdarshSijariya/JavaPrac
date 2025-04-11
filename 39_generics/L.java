import java.util.ArrayList;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(13);
        list.add(14);

        process(list);
    }

    static void process(ArrayList<? extends Number> x) {
        System.out.println(x);
        System.out.println(x.size());
        System.out.println(x.isEmpty());
        System.out.println(x.remove(0));
        System.out.println(x.get(0));

        // x.add(44);
        // x.set(0, 34);
    }
}