class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Employee createClone() {
        return (Employee)(this.clone());
    }
}

class C {
    public static void main(String[] args) {
        Employee emp = new Employee("Jay", 32);
    
        Employee x = emp.createClone();

        x.name = "Vijay";
        x.age = 42;

        System.out.println(emp.name);
        System.out.println(emp.age);
    }
}


// C.java:11: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
//         return (Employee)(this.clone());
//                                     ^
// 1 error