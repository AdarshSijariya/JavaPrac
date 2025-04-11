class E {
    public static void main(String[] args) {
        Employee e1 = new Employee("om", 12);
        Employee e2 = new Employee("om", 12);

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
}