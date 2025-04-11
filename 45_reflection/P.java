import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class P {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Method[] arr = klass.getDeclaredMethods();
        
        for(Method next : arr) {
            // System.out.println(next);
            System.out.println(Modifier.toString(next.getModifiers()) + " " + next.getReturnType().getName() + " " + next.getName());
        }
    }    
}
