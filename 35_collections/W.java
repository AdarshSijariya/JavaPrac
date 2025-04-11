import java.util.HashSet;

class W {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        
        set.add(new Student("jay", 12));
        set.add(new Student("vijay", 17));
        set.add(new Student("parajay", 18));
        set.add(new Student("digvijay", 10));
        set.add(new Student("ajay", 9));
        
        System.out.println(set);

        Student s = new Student("parajay", 18);
        System.out.println(set.contains(s));

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

    public boolean equals(Object obj) {
        Student x1 = this;
        Student x2 = (Student)obj;

        String nm1 = x1.name;
        String nm2 = x2.name;

        int ag1 = x1.age;
        int ag2 = x2.age;

        return nm1.equals(nm2) && ag1 == ag2;
    }
}