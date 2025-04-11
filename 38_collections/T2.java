import java.util.Arrays;

class T2 {
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
    }    
}


class Student  {
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


// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1041)
//         at T2.main(T2.java:17)