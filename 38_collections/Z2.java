import java.util.Arrays;
import java.util.List;

class Z2 {
    public static void main(String[] args) {
        Integer[] x = {34, 56, 78};

        for(int next : x) {
            System.out.print(next + ", ");
        }

        System.out.println("\n\n++++++++++++++++");
        
        List<Integer> list = Arrays.asList(x);
        
        System.out.println(list);
        
        list.add(1, 99);
        System.out.println("\n\n++++++++++++++++");

        for(int next : x) {
            System.out.print(next + ", ");
        }

    }    
}

// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.util.AbstractList.add(AbstractList.java:153)
//         at Z2.main(Z2.java:18)
