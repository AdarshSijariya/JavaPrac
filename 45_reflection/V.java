import java.lang.reflect.Method;

class V {
    public static void main(String[] args) throws Exception {
        Test4 t = new Test4();

        Class klass = t.getClass();

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            int x = (Integer)(next.invoke(t, 13, 12));

            System.out.println(x);
        }
    }    
}
