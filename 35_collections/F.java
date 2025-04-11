class F {
    public static void main(String[] args) {
        Employee e1 = new Employee("om", 12);
        Employee e2 = new Employee("om", 15);

        boolean flag = e1.equals(e2);

        System.out.println(flag);
        System.out.println(e1 == e2);
    }    
}


class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        Employee x1 = this;
        Employee x2 = (Employee)obj;

        String nm1 = x1.name;
        String nm2 = x2.name;

        return nm1.equals(nm2);
    }
}