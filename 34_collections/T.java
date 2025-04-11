import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(150);
        list.add(160);


        for(Integer next : list) {
            System.out.println(next); 
        }

        System.out.println("---------------");
        System.out.println(list);
    }
}