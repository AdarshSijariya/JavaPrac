import java.util.TreeSet;

class P {
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
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Student obj) {
        return this.name.compareTo(obj.name);
        // return obj.name.compareTo(this.name);
        // return obj.age.compareTo(this.age);
        // return this.age.compareTo(obj.age);
    }
}