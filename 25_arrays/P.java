class P {
    public static void main(String[] args) {
        String[][][] x = {
                            {
                                {"a1","a2","a3"},
                                {"a4"}
                            },
                            {
                                {"a5","a6"},
                                {"a7","a8","a9","a10","a11"},
                                {"a12"},
                                {"a13","a14","a15"}
                            },
                            {
                                {"a16","a17","a18"},
                                {"a19","a20"},
                                {"a21","a22","a23","a24","a25","a26","a27"}
                            }
                        };
        
        for(int i=0;i<x.length;i++) {
            for(int j=0; j<x[i].length; j++){
                for(int k=0; k<x[i][j].length; k++) {
                    System.out.print(x[i][j][k] + ", ");
                }
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~");
        }                
    }    
}
