import java.util.Scanner;

public class Q2 {
    
    static int i;
    static int j;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        abc(arr);
    }
    static void abc(int arr[][]){
        for(i=0;i<arr.length;i++){
            for(j=(arr.length-1);j>=0;j--){
                System.out.print(arr[j][i] + " ");


            }
            System.out.print("\n");

        }

    }
    
    
}
