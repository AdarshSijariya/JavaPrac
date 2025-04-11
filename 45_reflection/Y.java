class Y {
    public static void main(String[] args) {
        Class klass = ABC.class;

        Class[] arr = klass.getNestMembers();

        for(Class next : arr) {
            System.out.println(next.getName());
        }
    }    
}
