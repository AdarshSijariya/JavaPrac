import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@interface Gablu {

}

@Gablu
class S2 {
    @Gablu
    int y;    

    @Gablu
    S2() {

    }

    @Gablu
    void pro() {

    }
}
