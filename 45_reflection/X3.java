import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.Constructor;

class X3 {
    public static void main(String[] args) {
        Class klass = XYZ.class;

        Constructor[] constructors = klass.getDeclaredConstructors();

        for(Constructor next : constructors) {
            System.out.print(Modifier.toString(next.getModifiers()) + "  " + next.getName() + "(");

            int i = 0;
            Type[] paramTypes = next.getGenericParameterTypes();
            for(Type type : paramTypes) {
                if(i == paramTypes.length-1)
                    System.out.print(type.getTypeName());
                else
                    System.out.print(type.getTypeName() + ",");

                i++;
            }

            System.out.print(")");

            int j = 0;
            Type[] exceptionTypes = next.getGenericExceptionTypes();
            for(Type type : exceptionTypes) {
                if(j == 0)
                    System.out.print(" throws ");
                
                if(j == exceptionTypes.length-1)
                    System.out.print(type.getTypeName());
                else
                    System.out.print(type.getTypeName() + ",");

                j++;
            }

            System.out.println();
        }
    }    
}
