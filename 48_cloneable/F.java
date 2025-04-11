class Employee implements Cloneable {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class F {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 21);
    
        Employee x = null;
        try {
            x = (Employee)emp.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        x.name = "Vijay";
        x.age = 42;

        System.out.println(emp.name);
        System.out.println(emp.age);
    }
}