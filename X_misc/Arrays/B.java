class B {
    static int targetSum(int[] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i]+arr[j];
                if(temp==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
        int arr[] = {4,6,3,5,8,2};
        int target=7;
        System.out.println(targetSum(arr,target));
    }
    
}
