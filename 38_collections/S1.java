import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class S1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student("mohan", 19));
        list.add(new Student("rohan", 21));
        list.add(new Student("gohan", 17));
        list.add(new Student("tohan", 20));
        list.add(new Student("eohan", 18));

        System.out.println(list);
        
        // AgeDscSort comp = new AgeDscSort();
        // AgeAscSort comp = new AgeAscSort();
        // NameAscSort comp = new NameAscSort();
        NameDscSort comp = new NameDscSort();
        Collections.sort(list, comp);
        System.out.println(list);


        Student s = new Student("nohan", 21);
        int searchIndex = Collections.binarySearch(list, s, comp);

        System.out.println(searchIndex);
    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age  = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}
