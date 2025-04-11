import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.FIELD})
@interface Kablu {

}

@Kablu
class S4 {
    @Kablu
    int y;    

    @Kablu
    S4() {

    }

    @Kablu
    void pro() {

    }
}