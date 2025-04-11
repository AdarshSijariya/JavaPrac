import java.util.Arrays;

class T1 {
    public static void main(String[] args) {
        String[] x = {
                        "mohan",
                        "sohan",
                        "gohan",
                        "eohan",
                        "hohan"
                     };

        for(String next : x) {
            System.out.print(next + " ");
        }        

        Arrays.sort(x);

        System.out.println("\n++++++++++++++");

        for(String next : x) {
            System.out.print(next + " ");
        }        
    }    
}
