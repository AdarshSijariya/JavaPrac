import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;
    float salary;

    Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + age + " - " + salary;
    }
}
