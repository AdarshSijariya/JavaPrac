import java.lang.reflect.Modifier;

class H {
    public static void main(String[] args) throws ClassNotFoundException {
        Class klass = Class.forName("Teacher");

        int code = klass.getModifiers();

        System.out.println(code);
        String modifierString = Modifier.toString(code);
        System.out.println(modifierString);
    }    
}
