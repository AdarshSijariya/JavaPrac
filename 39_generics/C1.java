import java.util.ArrayList;

class C1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(13);
        x.add(14);

        Integer i = (Integer)x.get(0);
    
        System.out.println(i);
    }
}