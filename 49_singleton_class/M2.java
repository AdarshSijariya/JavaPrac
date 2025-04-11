class User implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student extends User {
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

class M2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student x = Student.getInstance();
        
        // Student y = Student.getInstance();
        Student y = (Student)x.clone();
       
        System.out.println(x);
        System.out.println(y);
    }
}
