import java.util.ArrayList;

class C2 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(14);

        Integer i = x.get(0);
    
        System.out.println(i);
    }
}