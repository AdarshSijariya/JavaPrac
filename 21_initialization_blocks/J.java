class J {
    static {
        System.out.println("hello");
    }   
    
    {
        System.out.println("hi");
    }
    
    J() {
        System.out.println("bye");
    }

    public static void main(String[] args) {
        J x = new J();
        J y = new J();
    }
}
