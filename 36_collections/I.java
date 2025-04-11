import java.util.TreeSet;

class I {
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

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}


// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable 