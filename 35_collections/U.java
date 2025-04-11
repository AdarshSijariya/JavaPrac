import java.util.HashSet;

class U {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set);
        
        set.add(new Student("jay", 12));
        set.add(new Student("vijay", 17));
        set.add(new Student("parajay", 18));
        set.add(new Student("digvijay", 10));
        set.add(new Student("ajay", 9));
        
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