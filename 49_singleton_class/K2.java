import java.lang.reflect.Constructor;

class Student {
    private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        if(x == null)
            x = new Student("chitragupta", 500);

        return x;
    }
}

class K2 {
    public static void main(String[] args) throws Exception {
        Student x = Student.getInstance();
        
        // Student y = Student.getInstance();
        Class klass = x.getClass();
        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);
        Student y = (Student)arr[0].newInstance("chhotabheem", 10);

        System.out.println(x);
        System.out.println(y);
    }
}