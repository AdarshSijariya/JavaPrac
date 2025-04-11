import java.util.ArrayList;
import java.util.Collections;

class O2 {
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

class Student implements Comparable {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age  = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Object obj) {
        return this.age.compareTo(((Student)obj).age);
    }
}
