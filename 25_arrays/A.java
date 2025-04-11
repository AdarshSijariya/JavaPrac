class A {
    public static void main(String[] args) {
        // int[] x = {34, 67, 12, 45, 23, 78, 3, 9, 90, 4, 19};
        int[] x = {1, 67, 12, 45, 23, 78, 3, 9, 90, 4, 19};

        int min = x[0];

        for(int i=1; i<x.length; i++) {
            if(x[i]%2==0 && min > x[i]) {
                min = x[i];
            } 
        }

        System.out.println("Min even Value: " + min);
    }    
}


// not ok