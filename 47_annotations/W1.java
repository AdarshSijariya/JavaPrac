import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Inherited;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Isro {
    String name();
}

@Isro(name="GSLV")
class User {

}

class Employee extends User {

}


class W1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Class klass = emp.getClass();

        Object obj = klass.getAnnotation(Isro.class);

        Isro isro = (Isro)obj;

        System.out.println(isro.name());
    }    
}
