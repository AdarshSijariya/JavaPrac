class G1 {
    public static void main(String[] args) {
        int[][] x = new int[2][];
        
        x[0] = new int[4];
        x[1] = new int[5];
    
        for(int i=0; i < x.length; i++) {
            System.out.println(x[i].length);
        }
    }
}
