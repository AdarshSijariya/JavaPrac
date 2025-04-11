class Z1 {
    static int i;

    public static void main(String[] args) {
        try {
            pro();
        } catch(StackOverflowError e) {
            System.out.println("Hello");
        }
        System.out.println("Hi");
    }   
    
    static void pro() {
        System.out.println(i++);
        pro();
    }
}