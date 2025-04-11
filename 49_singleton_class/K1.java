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

class K1 {
    public static void main(String[] args) throws Exception {
        Student x = Student.getInstance();
        
        // Student y = Student.getInstance();
        Class klass = x.getClass();
        Constructor[] arr = klass.getDeclaredConstructors();

        Student y = (Student)arr[0].newInstance("chhotabheem", 10);

        System.out.println(x);
        System.out.println(y);
    }
}


// Exception in thread "main" java.lang.IllegalAccessException: class K1 cannot access a member of class Student with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:361)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:591)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)
//         at K1.main(K1.java:30)