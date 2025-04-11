class S {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};

        int sum = 0;

        //Case 1:
        // for(int i = 0; i < x.length; i++) {
        //     sum = sum + x[i];
        // }

        //Case 2:
        // for(int next : x) {
        //     sum += next;    // sum = sum + next;            
        // }

        System.out.println(sum);
    }    
}
