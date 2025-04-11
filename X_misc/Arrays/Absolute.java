public class Absolute {
    static void reverse(int[] array){
        int i=0;
        int j= array.length-1;
        while(i<j){
            swap(array,i,j);
            i++;
            j--;
        }
    }
    static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr,int left,int right){
        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        
    }   
    static int[] squareRoot(int []arr){
        int right = arr.length - 1;
        int left= 0;
        int[] ans = new int[arr.length];
        int k= 0;
        while(left<=right){
            if(Math.abs(arr[left])>=Math.abs(arr[right])){
                ans[k++] =arr[left]*arr[left];
                left++; 
            }
            else{

                ans[k++]= arr[right] * arr[right];
                right--;
            }
        }
        return ans;
        
    }
    public static void main(String[] args){
        int arr[] = {-10,-2,2,4,5,6};
        int []ans = squareRoot(arr);
        reverse(ans);
        printArr(ans);

    }
}
