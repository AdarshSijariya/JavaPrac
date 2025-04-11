public class twoPointer1 {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr, int i, int end){
             int temp = arr[end];
            arr[end]=arr[i];
            arr[i] = temp;
        
    }
    static void sort(int[] arr){
        int end=arr.length-1;
        int i = 0;
        while(i<end){
            if(arr[i]==1&&arr[end]==0)
            swap(arr,i,end);
            
            if(arr[i]==0)
            i++;

            if(arr[end]==1)
            end--;
        }
        printArr(arr);
    }
    public static void main(String[] args){
        int[] arrr = {1,0,0,1,1,0,1,1,0,0};
        sort(arrr);
    }
}
