import java.lang.reflect.Method;

class N {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Method[] arr = klass.getMethods();

        for(Method next : arr) {
            System.out.println(next);
        }
    }    
}
