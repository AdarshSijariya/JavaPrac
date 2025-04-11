import java.util.Scanner;

class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] x = new String[3];

        for(int i=0; i < x.length; i++) {
            System.out.print("Enter next student name: ");
            x[i] = sc.next();
            // x[i] = sc.nextLine();
        }        

        System.out.println("++++++++++++++++++++++++");

        for(int i=0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }    
}
