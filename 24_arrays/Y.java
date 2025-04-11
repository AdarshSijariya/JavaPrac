class Y {
    public static void main(String[] args) {
        int[] x = {34, 67, 12, 45, 123, 78, 3, 9, 90, 2, 19};

        int max = x[0];

        for(int i=1; i<x.length; i++) {
            if(max < x[i]) {
                max = x[i];
            } 
        }

        System.out.println("Max Value: " + max);
    }    
}
