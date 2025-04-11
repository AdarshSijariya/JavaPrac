import java.util.Arrays;

class W {
    public static void main(String[] args) {
        String[] x = {
                        "mohan",
                        "sohan",
                        "gohan",
                        "eohan",
                        "hohan",
                        "kohan"
                     };

        for(String next : x) {
            System.out.print(next + " ");
        }        

        Arrays.sort(x);

        System.out.println("\n++++++++++++++");

        for(String next : x) {
            System.out.print(next + " ");
        }        

        System.out.println("\n++++++++++++++");

        // System.out.println(Arrays.binarySearch(x, "hohan"));
        System.out.println(Arrays.binarySearch(x, "iohan"));
    }    
}
