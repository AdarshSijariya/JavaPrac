import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String college();
    int rank();
}


@Info(college="GGITS",rank=1)
class Student {
    String name;
    int age;
}

class U2 {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Ritesh";
        x.age = 21;

        System.out.println(x.name);
        System.out.println(x.age);

        Class klass = x.getClass();

        Object obj = klass.getAnnotation(Info.class);

        Info info = (Info)obj;

        System.out.println(info.college());
        System.out.println(info.rank());
    }
}
