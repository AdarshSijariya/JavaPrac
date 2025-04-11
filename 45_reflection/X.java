import java.lang.reflect.Constructor;

class X {
    public static void main(String[] args) {
        Class klass = XYZ.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        for(Constructor next : arr) {
            System.out.println(next);
            System.out.println("\n -  ---------------------------- \n");
        }
    }    
}
