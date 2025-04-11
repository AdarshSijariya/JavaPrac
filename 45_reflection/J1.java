import java.lang.reflect.Field;

class J1 {
    public static void main(String[] args) {
        Class klass = Teacher.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field fld : arr) {
            System.out.println(fld + " - " + fld.getName());
        }
        
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Class klass2 = klass.getSuperclass();
        
        Field[] arr2 = klass2.getDeclaredFields();
        for(Field fld : arr2) {
            System.out.println(fld + " - " + fld.getName());
        }
    }    
}
