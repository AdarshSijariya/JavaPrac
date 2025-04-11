class Employee implements Cloneable {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Employee clone() {
        Employee x = null;
        
        try {
            x = (Employee)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return x;
    }
}

class F2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Gajodhar", 45);
    
        Employee x = emp.clone();

        x.name = "Vijay";
        x.age = 42;

        System.out.println(emp.name);
        System.out.println(emp.age);
    }
}