import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Isro {
    String name();
}

@Isro(name="PSLV")
class User {

}

class Employee extends User {

}


class W {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Class klass = emp.getClass();

        Object obj = klass.getAnnotation(Isro.class);

        Isro isro = (Isro)obj;

        System.out.println(isro.name());
    }    
}


// Exception in thread "main" java.lang.NullPointerException
//         at W.main(W.java:29)