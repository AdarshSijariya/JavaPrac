// import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

@Target({TYPE,METHOD/*,CONSTRUCTOR,FIELD*/})
@interface Wablu {

}

@Wablu
class S5 {
    @Wablu
    int y;    

    @Wablu
    S5() {

    }

    @Wablu
    void pro() {

    }
}