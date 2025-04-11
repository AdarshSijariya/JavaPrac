import java.util.Arrays;
import java.util.List;

class Z1 {
    public static void main(String[] args) {
        Integer[] x = {34, 56, 78};

        for(int next : x) {
            System.out.print(next + ", ");
        }

        System.out.println("\n\n++++++++++++++++");
        
        List<Integer> list = Arrays.asList(x);
        
        System.out.print(list);
        
        x[1] = -22;
        System.out.println("\n\n++++++++++++++++");
        
        System.out.print(list);
    }    
}
