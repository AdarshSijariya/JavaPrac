class A {
    public static void main(String[] args) {
        Employee e1 = new Employee("kartik", 32);
        Employee e2 = new Employee("kartik", 42);
        Employee e3 = new Employee("tkrika", 42);
        // Employee e3 = new Employee("tiket", 52);
        
        //contract 3:
        System.out.println(e1.equals(e3));
        System.out.println(e1.hashCode());
        System.out.println(e3.hashCode());

        //contract 2:
        // System.out.println(e1.equals(e2));
        // System.out.println(e1.hashCode());
        // System.out.println(e2.hashCode());

        //contract 1:
        // System.out.println(e.hashCode());
        // System.out.println(e.hashCode());
        // System.out.println(e.hashCode());
    }
}

class Employee {
    static String abc = " abcdefghijklmnopqrstuvwxyz";

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
        boolean flag = false;

        if(obj != null && obj instanceof Employee) {
            Employee e1 = this;
            Employee e2 = (Employee)obj;

            String nm1 = e1.name;
            String nm2 = e2.name;

            flag = nm1.equals(nm2);
        }

        return flag;
    }

    public int hashCode() {
        int sum = 0;

        for(int i=0; i < name.length(); i++) {
            sum += abc.indexOf(name.charAt(i));
        }

        // System.out.println(sum);

        return sum;
    }
}