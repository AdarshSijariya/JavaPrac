import java.util.TreeSet;

class N {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

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

class Student implements Comparable {
    String name; 
    Integer age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Object obj) {
        Student x1 = this;
        Student x2 = (Student)obj;

        Integer ag1 = x1.age;
        Integer ag2 = x2.age;

        return ag2.compareTo(ag1);
    }
}