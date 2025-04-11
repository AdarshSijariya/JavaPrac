class Employee extends User {
    String designation;
    float salary;

    Employee(String name, int age, String designation, float salary) {
        super(name, age);        
        this.designation = designation;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + age + " - " + designation + " - " + salary;
    }
}
