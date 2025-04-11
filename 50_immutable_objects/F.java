//how to create an immutable object of a class:
//Step 1: mark your class final...

final class Student {
    //Step 2:
    //declare all the instance-variables private...
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class F {
    public static void main(String[] args) {
        Student x = new Student("hitesh", 21);
        
        // System.out.println(x.name + " - " + x.age + " - " + x);
        System.out.println(x.getName() + " - " + x.getAge() + " - " + x);

        // x.name = "yamraj";
        x.setName("yamraj");
        // x.age = 100;
        x.setAge(1000);

        System.out.println(x.getName() + " - " + x.getAge() + " - " + x);
    }
}