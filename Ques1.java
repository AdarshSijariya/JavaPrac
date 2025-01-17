
import java.util.Scanner;

public class Ques1 {
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
       pro(arr);
    }

    static void pro(int[][] arr){

        int top = 0 ;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[0].length-1;

        while(top<=bottom && left<= right){
            for (i=left; i<=right;i++) {
                System.out.print(arr[top][i]);
            }
        
            top++;
            for (i = top;i <= bottom;i++) {
                System.out.print(arr[i][right]);
            }
            right--;
            if (top<= bottom) {
                for (i= right;i >= left;i--) {
                    System.out.print(arr[bottom][i]);
                }
                bottom--;
                if (left <= right) {
                    for (i = bottom;i >= top;i--) {
                        System.out.print(arr[i][left]);
                    }
                    left++;
                }
            }

        }
    }
}
