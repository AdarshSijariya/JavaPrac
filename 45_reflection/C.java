class C {
    public static void main(String[] args) {
        try {
            Class klass = Class.forName("User");

            System.out.println(klass);
            System.out.println(klass.getName());
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}