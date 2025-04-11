import java.util.Arrays;
import java.util.Comparator;

class Y {
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

        AgeAscSort comp = new AgeAscSort();

        Arrays.sort(x, comp);

        System.out.println("\n++++++++++++++");

        for(Student next : x) {
            System.out.print(next + ", ");
        }
        
        System.out.println("\n++++++++++++++");

        Student s = new Student("rohan", 16);
        System.out.println(Arrays.binarySearch(x, s, comp));

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