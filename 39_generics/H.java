import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList<Integer> list = process();

        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
    }

    static ArrayList process() {
        ArrayList x = new ArrayList();

        x.add("om");
        x.add(23);
        x.add(true);

        return x;
    }
}
