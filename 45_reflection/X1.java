import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.Constructor;

class X1 {
    public static void main(String[] args) {
        Class klass = XYZ.class;

        Constructor[] constructors = klass.getDeclaredConstructors();

        for(Constructor next : constructors) {
            System.out.print(Modifier.toString(next.getModifiers()) + "  " + next.getName() );
        }
    }    
}
