class User {
    String mobile;
    String city;
    User(String mobile, String city) {
        this.mobile = mobile;
        this.city = city;
    }
}

class Employee extends User implements Cloneable {
    String name;
    int age;

    Employee(String name, int age, String mobile, String city) {
        super(mobile, city);
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

class G {
    public static void main(String[] args) {
        Employee x = new Employee("Gajodhar", 45, "9999999999", "yampuri");
    
        Employee emp = x.clone();

        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.mobile);
        System.out.println(emp.city);
    }
}