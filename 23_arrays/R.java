import java.util.Scanner;

class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

        for(int i=0;i<3;i++) {
            System.out.println(x[i]);
        }
    }    
}
