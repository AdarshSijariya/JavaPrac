class G {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Class[] arr = klass.getInterfaces();

        for(Class cl : arr) {
            System.out.println(cl + " - " + cl.getName());
        }
    }    
}
