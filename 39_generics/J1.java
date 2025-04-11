import java.util.ArrayList;

class J1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(12);
        l1.add(13);
        l1.add(14);

        ArrayList<Float> l2 = new ArrayList<Float>();
        l2.add(2.3f);
        l2.add(4.8f);
        l2.add(7.9f);


        process(l1);
        process(l2);
    }   
    
    static void process(ArrayList x) {
        System.out.println(x);

        x.add("mohan");
        x.add(true);

        System.out.println(x);
    }
}