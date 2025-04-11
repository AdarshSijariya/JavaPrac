class T {
    public static void main(String[] args) {
        int[] x = {23, 67, 2, 89, 12, 53, 27, 11, 44, 22};

        int count = 0;

        for(int i=0; i < x.length; i++) {
            if(x[i] % 2 == 0)
                count++;
        }

        System.out.println(count);
    }    
}
