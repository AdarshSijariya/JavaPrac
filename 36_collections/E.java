import java.util.HashSet;
import java.util.LinkedHashSet;

class E {
    public static void main(String[] args) {
        // HashSet<Student> set = new HashSet<Student>();
        LinkedHashSet<Student> set = new LinkedHashSet<Student>();
        
        set.add(new Student("jay", 12));
        set.add(new Student("vijay", 17));
        set.add(new Student("parajay", 18));
        set.add(new Student("digvijay", 10));
        set.add(new Student("ajay", 9));
        set.add(new Student("parajay", 18));
        
        System.out.println(set);        
    }    
}

class Student {
    static String abc = " abcdefghijklmnopqrstuvwxyz";

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
        boolean flag = false;

        if(obj != null && obj instanceof Student) {
            Student e1 = this;
            Student e2 = (Student)obj;

            String nm1 = e1.name;
            String nm2 = e2.name;

            int ag1 = e1.age;
            int ag2 = e2.age;

            flag = nm1.equals(nm2) && ag1 == ag2;
        }

        return flag;
    }

    public int hashCode() {
        int sum = 0;

        for(int i=0; i < name.length(); i++) {
            sum += abc.indexOf(name.charAt(i));
        }

        sum += age;

        return sum;
    }
}