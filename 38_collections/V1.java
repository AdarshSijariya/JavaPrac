import java.util.Arrays;

class V1 {
    public static void main(String[] args) {
        int[] x = {45, 12, 67, 34, 9, 23};

        for(int next : x) {
            System.out.print(next + ", ");
        }
        
        Arrays.sort(x);
        
        System.out.println("\n\n+++++++++++++++\n");
        for(int next : x) {
            System.out.print(next + ", ");
        }

        int searchIndex = Arrays.binarySearch(x, 12);
        // int searchIndex = Arrays.binarySearch(x, 34);

        System.out.println("\n\nSearch Index: " + searchIndex);
    }
}