class Employee implements Cloneable {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Employee createClone() {
        Employee em = null;
        
        try {
            em = (Employee)(this.clone());
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return em;
    }
}

class E {
    public static void main(String[] args) {
        Employee emp = new Employee("Jay", 32);
    
        Employee x = emp.createClone();

        x.name = "Vijay";
        x.age = 42;

        System.out.println(emp.name);
        System.out.println(emp.age);
    }
}