class Student implements Cloneable {
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

    public Student clone() {
        Student st = null;

        try {
            st = (Student)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return st;
    }
}

class M1 {
    public static void main(String[] args) {
        Student x = Student.getInstance();
        
        // Student y = Student.getInstance();
        Student y = x.clone();
       
        System.out.println(x);
        System.out.println(y);
    }
}
