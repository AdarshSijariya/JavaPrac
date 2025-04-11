import java.lang.reflect.Constructor;

//public static final Student AA = new Student("kaliya", 10);

enum Student {
    AA("kaliya",10);
    // private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public static Student getInstance() {
    //     if(x == null)
    //         x = new Student("chitragupta", 500);

    //     return x;
    // }
}

class L {
    public static void main(String[] args) throws Exception {
        // Student x = Student.getInstance();
        Student x = Student.AA;
        
        // Student y = Student.getInstance();
        Class klass = x.getClass();
        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);
        Student y = (Student)arr[0].newInstance("chhotabheem", 10);

        System.out.println(x);
        System.out.println(y);
    }
}


// Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)
//         at L.main(L.java:35)