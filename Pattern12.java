class Pattern12 {
    public static void main(String[] args){
        int n=10;
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(n-(i*2))/2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                 System.out.print(num+ " ");
            }
            System.out.println("");
            num++;
        }
    }    
}
