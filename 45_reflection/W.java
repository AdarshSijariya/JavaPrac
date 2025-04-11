import java.lang.reflect.Constructor;

class W {
    public static void main(String[] args) {
        Class klass = XYZ.class;

        Constructor[] arr = klass.getConstructors();

        for(Constructor next : arr) {
            System.out.println(next);
        }
    }    
}
