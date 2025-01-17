import java.util.Scanner;
class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[sc.nextInt()];
        S
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            
        }    
        pro(arr);
    }
    static void pro(int[] arr){
        int n=0;
        for(int i=0;i<arr.length-2;i++){
            if((i+1)<arr.length){
                if(arr[i]<arr[i+1]&& arr[i+1]>arr[i]+arr[i+2] ){
                    n=n+arr[i];
                }else if(arr[i+1]<=arr[i]+arr[i+2]){
                    n=n+arr[i+1];
                    i++;
                }
            }
               
        }
        
        System.out.println(n);

    }
}



