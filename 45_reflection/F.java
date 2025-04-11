class F {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Class klass2 = klass.getSuperclass();

        System.out.println(klass);
        System.out.println(klass.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(klass2);
        System.out.println(klass2.getName());
    }    
}
