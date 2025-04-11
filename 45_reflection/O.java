import java.lang.reflect.Method;

class O {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            // System.out.println(next);
            System.out.println(next.getReturnType().getName() + " " + next.getName());
        }
    }    
}
