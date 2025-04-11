import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class U {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Test3 t = new Test3();

        Class klass = t.getClass();

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            // System.out.println(next);
            next.setAccessible(true);
            next.invoke(t);
        }
    }    
}
