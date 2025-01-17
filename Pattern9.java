class Pattern9 {
    public static void main(String[] args){
        int a=1;
        for(int i=1;i<=5;i++){
            if(i%2 ==1){
                a=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
                if(a>1){
                    a=0;
                }
            }
            System.out.println("");
        }
    }    
}
