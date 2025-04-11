import java.lang.reflect.Field;

class I {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Field[] arr = klass.getFields();

        for(Field fld : arr) {
            System.out.println(fld + " - " + fld.getName());
        }
    }    
}
