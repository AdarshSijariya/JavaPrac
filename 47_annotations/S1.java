import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface Dablu {

}

@Dablu
class S1 {
    @Dablu
    int y;    

    @Dablu
    S1() {

    }

    @Dablu
    void pro() {

    }
}
