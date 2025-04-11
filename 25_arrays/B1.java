class B1 {
    public static void main(String[] args) {
        // int[] x = {34, 67, 12, 45, 23, 78, 3, 9, 90, 4, 19};
        int[] x = {121, 67, 12, 45, 23, 78, 3, 9, 90, 4, 19};
        
        // int maxEven = x[0];
        int maxEven = 0;

        for(int next : x) {
            if(next % 2 == 0) {
                maxEven = next;
                break;
            }
        }

        for(int i=1; i<x.length; i++) {
            if(x[i]%2==0 && maxEven < x[i]) {
                maxEven = x[i];
            } 
        }

        System.out.println("Max even Value: " + maxEven);
    }    
}
