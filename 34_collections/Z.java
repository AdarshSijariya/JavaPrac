import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(7);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(0);
        list.add(12);

        System.out.println(list);
        System.out.println("++++++++++++++");
        
        int len = list.size();
        for(int i=0;i<len;i++) {
            // System.out.println(list.remove(i));
            System.out.println(list.remove(0));
        }

        System.out.println("++++++++++++++");
        System.out.println(list);
    }    
}
