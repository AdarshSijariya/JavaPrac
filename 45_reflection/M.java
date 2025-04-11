import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import java.util.Date;

class M {
    public static void main(String[] args) throws IllegalAccessException {
        Teacher t = new Teacher("PHd", 2500000.50f, "Physics", 32, new Date(7789879877897L), "A");
        Teacher s = new Teacher("MTech", 250000.50f, "Chemistry", 12, new Date(6889879871297L), "A");
        
        Class klass = Teacher.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field fld : arr) {
            System.out.println(Modifier.toString(fld.getModifiers()) + " - "+ fld.getType().getName() + " - " + fld.getName() + " = " + fld.get(t));
        }
    }    
}
