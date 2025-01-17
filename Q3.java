import java.util.Scanner;

class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        pro(arr);
    }
    static  void pro(int[] arr) {
        int sum = arr[0];
        int  maximum_no= arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maximum_no = Math.max(maximum_no, sum);
        }
        
        System.out.println(maximum_no);
    }
}

 