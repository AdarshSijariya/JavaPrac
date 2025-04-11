class V1 {
    public static void main(String[] args) {
        int[] x = {23, 67, 2, 89, 12, 53, 27, 11, 44, 22};

        for(int next : x) {
            System.out.print(next + ", ");
        }

        int count = 0;

        System.out.print("\n\nodd values: ");
        for(int i=0; i < x.length; i++) {
            if(x[i] % 2 == 0) {
                count++;
                continue;
            }
            
            System.out.print(x[i] + ", ");
        }

        System.out.println("\n\neven count: " + count);
    }    
}
