class rotation{
    public static void main(String[] args){
        int [] arr={4,5,6,7,8,9,10};
        int n= arr.length;
        int d=3;
        rotate(arr,n,d);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static void rotate( int arr[], int n,int d){
        int temp = 0;
        int temp1 = d-1;
        for(int i=0;i<d/2;i++){
            temp=arr[i];
            arr[i]= arr[temp1];
            arr[temp1]= temp;
            temp1--;
        }
        temp1 = n-1;
        //temp=0;
        for(int j=d;j<(n+d)/2;j++){
            temp = arr[j];
            arr[j]=arr[temp1];
            arr[temp1]= temp;
            temp1--;
        }
        temp1=n-1;
        //temp=0;
        for(int k=0;k<n/2;k++){
            temp=arr[k];
            arr[k]=arr[temp1];
            arr[temp1]=temp;
            temp1--;
        }
    }
}