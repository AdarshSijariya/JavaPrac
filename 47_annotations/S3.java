import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
@interface Tablu {

}

@Tablu
class S3 {
    @Tablu
    int y;    

    @Tablu
    S3() {

    }

    @Tablu
    void pro() {

    }
}


// S3.java:11: error: annotation type not applicable to this kind of declaration
//     @Tablu
//     ^
// 1 error