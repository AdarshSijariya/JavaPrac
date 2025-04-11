import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

class Q {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Method[] arr = klass.getDeclaredMethods();
        
        for(Method next : arr) {
            // System.out.println(next);
            System.out.print(Modifier.toString(next.getModifiers()) + " " + next.getReturnType().getName() + " " + next.getName() + "(");
        
            Type[] arr2 = next.getGenericParameterTypes();

            int i = 0;
            for(Type a : arr2) {
                if(i==arr2.length-1)
                    System.out.print(a.getTypeName());
                else
                    System.out.print(a.getTypeName() + ",");
                
                i++;
            }

            System.out.println(")");
        }
    }    
}
