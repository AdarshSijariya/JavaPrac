class Employee {
    String name;
    int age;
    String designation;
    int salary;

    Employee(String name, int age, String designation, int salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

class K {
    public static void main(String[] args) {
        Employee x = new Employee("om", 27, "manager", 300000);

        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.designation);
        System.out.println(x.salary);

        Employee y = new Employee("ram", 31, "CTO", 5000000);

        System.out.println(y.name);
        System.out.println(y.age);
        System.out.println(y.designation);
        System.out.println(y.salary);
    }
}
