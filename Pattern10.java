class Pattern10 {
    public static void main(String[] args){
        int n=4;
        for( int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");   
                }
                for(int j2=1;j2<=2*(n-i);j2++){
                    System.out.print(" ");
                }
                for(int j3=1;j3<=i;j3++){
                    System.out.print("*");   
                }
            
            System.out.println("");
        }
        for(int i2=4;i2>0;i2--){
            for( int k=n;k>n+-i2;k--){
                System.out.print("*");
            }
            for(int k2=1;k2<=2*(n-i2);k2++){
                System.out.print(" ");
            }
            for(int k3=n;k3>n-i2;k3--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
 