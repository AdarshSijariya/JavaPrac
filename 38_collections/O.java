import java.util.ArrayList;
import java.util.Collections;

class O {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student("mohan", 19));
        list.add(new Student("rohan", 21));
        list.add(new Student("gohan", 17));
        list.add(new Student("tohan", 20));
        list.add(new Student("eohan", 18));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}
