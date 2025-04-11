class Employee implements Cloneable {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
}

class F1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Manohar", 28);
    
        Employee x = null;
        try {
            x = emp.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        x.name = "Vijay";
        x.age = 42;

        System.out.println(emp.name);
        System.out.println(emp.age);
    }
}