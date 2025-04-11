import java.util.Arrays;

class X {
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

        Arrays.sort(x);

        System.out.println("\n++++++++++++++");
        
        for(Student next : x) {
            System.out.print(next + ", ");
        }        

        System.out.println("\n++++++++++++++");
    

        Student s = new Student("kohan", 19);
        System.out.println(Arrays.binarySearch(x, s));
    }    
}


class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}