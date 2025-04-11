//how to create an immutable object of a class:
//Step 1: mark your class final...

import java.lang.reflect.Field;
import java.util.ArrayList;

final class Student {
    //Step 2:
    //declare all the instance-variables private final ...
    private final String name;
    private final int age;
    private final ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int age, int... marks) {
        this.name = name;
        this.age = age;
        for(int m : marks) {
            this.marks.add(m);
        }
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

    public ArrayList<Integer> getMarks() {
        // return marks;
        ArrayList<Integer> tmp = null;

        try {
            tmp = (ArrayList)marks.clone();
        } catch(Exception e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public int getAge() {
        return age;
    }

    // public String toString() {
    //     return name + " - " + age + " - " + marks + " - " + this;
    // }
}

class I1 {
    public static void main(String[] args) throws Exception{
        Student x = new Student("hitesh", 21, 70, 80, 60);
        
        System.out.println(x.getName() + " - " + x.getAge() + " - " + x.getMarks() + " - " + x);

        ArrayList<Integer> mks = x.getMarks();
        mks.add(100); 
        mks.add(200); 
        mks.add(300); 

        System.out.println(x.getName() + " - " + x.getAge()  + " - " + x.getMarks() + " - " + x);
    }
}