interface RRR {
    int pro(int x, int y);
}

class R {
    public static void main(String[] args) {
        RRR r1 = (a,b) ->  a+b;
        RRR r2 = (a,b) ->  a-b;
    
        
        System.out.println(r1.pro(25, 13));
        System.out.println(r2.pro(25, 13));
    }    
}
