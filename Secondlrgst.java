import java.util.Scanner;
class Secondlrgst{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,5,8,3,9};
        int result = solution(arr);
        
    }
    public static int solution(int[] arr){
        int largest= 0;
        int seclargest=0;
        if(arr.length<2){
            System.out.println("-1");
        }
        for(int i= 0;i<arr.length;i++){
            if(arr[i]>largest){
               seclargest = largest;
               largest= arr[i];
            }
            else if(arr[i]<largest && arr[i]> seclargest){
                seclargest = arr[i];
            }
        }
        if (seclargest == 0){
            System.out.println("-1");
        } else {
            System.out.println(seclargest);
        }
        return 0;
    }
}