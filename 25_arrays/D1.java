class D1 {
    public static void main(String[] args) {
        int[] x = {12, 56, 3, 9};

        int[] y = new int[x.length];

        System.out.println("y array before :");
        for(int next : y) {
            System.out.print(next + ", ");
        }

        for(int i=0, j=x.length-1; i < x.length; i++, j--) {
            // y[i] = x[j];
            y[j] = x[i];
            // System.out.println(i + " - " + (x.length-i-1));
        }

        System.out.println("\n\ny array after :");
        for(int next : y) {
            System.out.print(next + ", ");
        }
    }    
}
