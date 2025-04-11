import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class T {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Test2 t = new Test2();

        Class klass = t.getClass();

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            // System.out.println(next);
            System.out.println(next.invoke(t, 55, 77, 99));
        }
    }    
}
