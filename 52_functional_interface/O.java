interface R {
    int add(int x, int y);
}

class O {
    public static void main(String[] args) {
        R r = (a,b) ->  a+b;
    
        int result = r.add(12, 13);
    
        System.out.println(result);
    }    
}
