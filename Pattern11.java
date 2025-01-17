class Pattern11 {
    public static void main(String[] args){
        int n=5;
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
