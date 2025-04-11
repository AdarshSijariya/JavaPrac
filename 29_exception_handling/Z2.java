class Z2 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            throw new RuntimeException();
        } catch(RuntimeException x) {
            System.out.println(x);
        }

        System.out.println(2);
    }    
}
