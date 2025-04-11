public class twoSum {
    public static void main(String[] args){
        twoSum obj = new twoSum();
        int[] arr = {1,3,6,7,8};
        int max_value = 0;
        for(int i= 0;i<arr.length-1;i++){
            int temp = arr[i]+arr[i+1];
            
            if(max_value<temp){
                max_value= temp;
            }
        
        }

         System.out.println(max_value);
    }
}
