class F1 {
    int x = 101;
    
    public static void main(String[] args) {
        F1 e = new F1();
        System.out.println(e.x);

        e.x = 34;

        F1 f = new F1();
        System.out.println(f.x);
    }
}