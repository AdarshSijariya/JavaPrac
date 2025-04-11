interface S {
    void pro(int x);
}

class N {
    public static void main(String[] args) {
        S y = x -> System.out.println("Argument: " + x);
    
        y.pro(1000);
    }    
}
