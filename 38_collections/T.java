import java.util.Arrays;

class T {
    public static void main(String[] args) {
        int[] x = {56, 23, 78, 12, 55, 43, 9};

        for(int next : x) {
            System.out.print(next + " ");
        }        

        Arrays.sort(x);

        System.out.println("\n++++++++++++++");

        for(int next : x) {
            System.out.print(next + " ");
        }        
    }    
}
