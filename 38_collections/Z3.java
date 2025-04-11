import java.util.Arrays;
import java.util.List;

class Z3 {
    public static void main(String[] args) {
        Integer[] x = {34, 56, 78};

        for(int next : x) {
            System.out.print(next + ", ");
        }

        System.out.println("\n\n++++++++++++++++");
        
        List<Integer> list = Arrays.asList(x);
        
        System.out.println(list);
        
        list.remove(1);
        System.out.println("\n\n++++++++++++++++");

        for(int next : x) {
            System.out.print(next + ", ");
        }
    }    
}


// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.util.AbstractList.remove(AbstractList.java:167)
//         at Z3.main(Z3.java:18)