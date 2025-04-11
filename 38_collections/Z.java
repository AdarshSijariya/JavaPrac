import java.util.Arrays;
import java.util.List;

class Z {
    public static void main(String[] args) {
        Integer[] x = {34, 56, 78};

        for(int next : x) {
            System.out.print(next + ", ");
        }

        System.out.println("\n\n++++++++++++++++");
        
        List<Integer> list = Arrays.asList(x);
        
        System.out.print(list);
        
        list.set(1, 99);
        System.out.println("\n\n++++++++++++++++");

        for(int next : x) {
            System.out.print(next + ", ");
        }

    }    
}
