//how to create an immutable object of a class:
//Step 1: mark your class final...

import java.lang.reflect.Field;

final class Student {
    //Step 2:
    //declare all the instance-variables private final ...
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Step 3:
    //comment/remove all setter methods... 
    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public int getAge() {
        return age;
    }
}

class H {
    public static void main(String[] args) throws Exception{
        Student x = new Student("hitesh", 21);
        
        System.out.println(x.getName() + " - " + x.getAge() + " - " + x);

        Class klass = x.getClass();

        Field[] arr = klass.getDeclaredFields();
        
        arr[0].setAccessible(true);
        arr[0].set(x, "yamraj");
        arr[1].setAccessible(true);
        arr[1].set(x, 1000);

        System.out.println(x.getName() + " - " + x.getAge() + " - " + x);
    }
}