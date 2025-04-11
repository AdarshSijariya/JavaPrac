@interface Info {
    String college();
    int rank();
}


@Info(college="JEC",rank=1)
class Student {
    String name;
    int age;
}

class U1 {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Hitesh";
        x.age = 10;

        System.out.println(x.name);
        System.out.println(x.age);

        Class klass = x.getClass();

        Object obj = klass.getAnnotation(Info.class);

        Info info = (Info)obj;

        System.out.println(info.college());
        System.out.println(info.rank());
    }
}


// Hitesh
// 10
// Exception in thread "main" java.lang.NullPointerException
//         at U1.main(U1.java:27)