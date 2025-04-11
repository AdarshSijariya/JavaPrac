class Employee {
    String name;
    int age;
    String designation;
    int salary;

    Employee() {
        this.name = "om";
        this.age = 34;
        this.designation = "COO";
        this.salary = 12000000;
    }
}

class L {
    public static void main(String[] args) {
        Employee x = new Employee();

        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.designation);
        System.out.println(x.salary);

        Employee y = new Employee();

        System.out.println(y.name);
        System.out.println(y.age);
        System.out.println(y.designation);
        System.out.println(y.salary);
    }
}
