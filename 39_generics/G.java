import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(15);
        list.add(9);

        process(list);
    }    

    static void process(ArrayList x) {
        x.add("mohan");
        x.add(2.34);
        x.add(true);

        System.out.println(x);
    }
}
