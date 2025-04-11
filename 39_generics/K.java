import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(12);
        l1.add(13);
        l1.add(14);

        ArrayList<Float> l2 = new ArrayList<Float>();
        l2.add(2.3f);
        l2.add(4.8f);
        l2.add(7.9f);


        showRecords(l1);
        System.out.println("\n+++++++++++++++");
        showRecords(l2);
        System.out.println("\n+++++++++++++++");
    
        averageOfRecords(l1);
        averageOfRecords(l2);
    }   
    
    static void showRecords(ArrayList<? extends Number> x) {
        for(Number next : x) {
            System.out.print(next + ", ");
        }
    }

    static void averageOfRecords(ArrayList<? extends Number> x) {
        if(x.get(0) instanceof Integer) {
            int sum = 0;
            for(Number next : x) {
                sum += (Integer)next;
            }

            System.out.println(sum/x.size());
        } else if(x.get(0) instanceof Float) {
            float sum = 0;
            for(Number next : x) {
                sum += (Float)next;
            }

            System.out.println(sum/x.size());
        }         
    }
}