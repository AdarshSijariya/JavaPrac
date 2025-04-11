import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class L {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field fld : arr) {
            System.out.println(Modifier.toString(fld.getModifiers()) + " - "+ fld.getType().getName() + " - " + fld.getName());
        }
    }    
}
