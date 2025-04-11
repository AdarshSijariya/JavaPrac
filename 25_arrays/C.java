class C {
    public static void main(String[] args) {
        int[] x = {12, 56, 3, 9};

        int[] y;

        y = new int[x.length];

        System.out.println("y array before :");
        for(int next : y) {
            System.out.print(next + ", ");
        }
        
        for(int i=0; i<x.length; i++) {
            y[i] = x[i];
        }

        System.out.println("\n\ny array after :");
        for(int next : y) {
            System.out.print(next + ", ");
        }

        System.out.println("\n\nx array :");
        for(int next : x) {
            System.out.print(next + ", ");
        }
    }    
}
