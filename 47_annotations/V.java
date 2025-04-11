import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String college() default "JEC";
    int rank() default 1;
}


@Info
class Student {
    String name;
    int age;
}

class V {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Vinayak";
        x.age = 18;

        System.out.println(x.name);
        System.out.println(x.age);

        Class klass = x.getClass();

        Object obj = klass.getAnnotation(Info.class);

        Info info = (Info)obj;

        System.out.println(info.college());
        System.out.println(info.rank());
    }
}
