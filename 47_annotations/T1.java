import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Pqr {

}

@Pqr
class Y2 {

}

class T1 {
    public static void main(String[] args) {
        Class klass = Y2.class;
        
        Object obj = klass.getAnnotation(Pqr.class);

        System.out.println(obj);
    }    
}
