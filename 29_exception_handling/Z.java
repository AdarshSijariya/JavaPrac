class Z {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            throw new Error();
        } catch(Error x) {
            System.out.println(x);
        }

        System.out.println(2);
    }    
}
