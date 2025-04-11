class I {
    static {
        System.out.println("hi");
    }    
    
    I() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        I a = new I();
        I b = new I();
        I c = new I();
    }
}
