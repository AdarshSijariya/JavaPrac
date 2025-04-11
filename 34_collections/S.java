import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);


        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------");
        System.out.println(list);
    }
}

