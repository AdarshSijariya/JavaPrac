import java.lang.reflect.Method;

class N1 {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            // System.out.println(next);
            System.out.println(next.getName());
        }
    }    
}
