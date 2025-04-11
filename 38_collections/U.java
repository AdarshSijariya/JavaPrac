import java.util.Arrays;
import java.util.Comparator;

class U {
    public static void main(String[] args) {
        Student[] x = {
                        new Student("mohan", 12),
                        new Student("sohan", 19),
                        new Student("gohan", 17),
                        new Student("eohan", 15),
                        new Student("hohan", 10)
                     };

        for(Student next : x) {
            System.out.print(next + ", ");
        }        

        Arrays.sort(x, new AgeAscSort());

        System.out.println("\n++++++++++++++");

        for(Student next : x) {
            System.out.print(next + ", ");
        }        
    }    
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
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
        return name + "-" + age;
    }
}