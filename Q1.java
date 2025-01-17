import java.util.Scanner;

class Q1 {
    static int i;
    static int j;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
                if (i == 0 && j == 2 || i == 1 && j == 2) {
                    i++;
                    if (i == 2 && j == 2) {
                        for (j = 2; j > 0; j--) {
                            System.out.println(arr[i][j]);
                        }
                    }
                }

                if (i == 2 && j == 0) {
                    i--;
                    if (i == 1 && j == 0) {
                        System.out.println(arr[i][j]);
                    }
                }

            }
        }
    }

}