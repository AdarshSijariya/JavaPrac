class Z1 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            throw new Exception();
        } catch(Exception x) {
            System.out.println(x);
        }

        System.out.println(2);
    }    
}
