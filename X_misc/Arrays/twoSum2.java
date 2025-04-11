public class twoSum2 {
    static int answer(int arr[]){
        if(arr.length<2){
            new IllegalArgumentException("Size of Array must be 2 or greater");
        }
        int max_value=0;
        for (int i=0;i<arr.length-1;i++){
            int result = arr[i]+arr[i+1];
            if(result>max_value){
                max_value=result;
            }
        }
        return max_value;
    }

    public static void main(String []args){
        int[] arr={8,6,2,3,10};
        System.out.println(answer(arr));
    }
}
