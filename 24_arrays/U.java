import java.util.Scanner;

class U {
    public static void main(String[] args) {
        int[] x = {23, 67, 2, 89, 12, 53, 27, 11, 44, 22};

        for(int next : x) {
            System.out.print(next + ", ");
        }

        System.out.print("\n\nEnter a number: ");
        int input = new Scanner(System.in).nextInt();

        System.out.print("\noutput: ");

        for(int i=0; i < x.length; i++) {
            if(x[i] > input)
                System.out.print(x[i] + ", ");
        }
    }    
}
