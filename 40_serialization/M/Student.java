import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    String college;

    Student(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String toString() {
        return name + " - " + age + " - " + college;
    }
}
