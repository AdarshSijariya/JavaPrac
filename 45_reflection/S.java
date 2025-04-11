import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

class S {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Test t = new Test();    
        t.name = "yamraj";

        Test t2 = new Test();
        t2.name = "chitragupta";

        Class klass = t.getClass();

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            // System.out.println(next);

            next.invoke(t2);
        }
    }    
}
