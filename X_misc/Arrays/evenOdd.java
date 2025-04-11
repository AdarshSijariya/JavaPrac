public class evenOdd {
    static void sort(int[] arr){
        int left = 0;
        int right = arr.length-1; 
        while(left<right){
            if (arr[left]%2==1&&arr[right]%2==0){
                swap(arr, left, right);
            }
            

            if(arr[left]%2==0){
                left++;
            }
            

            if(arr[right]%2 != 0){
                right--;
            }
        }
        printArr(arr);

    }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr,int left, int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        sort(arr);

    }
}
