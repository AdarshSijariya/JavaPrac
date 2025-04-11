import java.util.TreeSet;
import java.util.Comparator;

class Q {
    public static void main(String[] args) {
        NameAscSort s1 = new NameAscSort();
        TreeSet set = new TreeSet(s1);

        System.out.println(set);        
    
        set.add(new Student("mohan", 34));
        set.add(new Student("tohan", 5));
        set.add(new Student("gohan", 12));
        set.add(new Student("sohan", 56));
        set.add(new Student("rohan", 22));
        set.add(new Student("eohan", 9));
        
        System.out.println(set);        
    }
}

class NameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student x1 = (Student)o1;
        Student x2 = (Student)o2;

        String nm1 = x1.name;
        String nm2 = x2.name;

        return nm1.compareTo(nm2);
    }
}

class Student {
    String name; 
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}