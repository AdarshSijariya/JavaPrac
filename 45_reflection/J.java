import java.lang.reflect.Field;

class J {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field fld : arr) {
            System.out.println(fld + " - " + fld.getName());
        }
    }    
}
