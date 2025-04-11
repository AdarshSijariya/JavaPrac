import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for NameAscSort\n2 for NameDscSort\n3 for AgeAscSort\n4 for AgeDscSort: ");

        int input = sc.nextInt();

        Comparator comp = null;
        switch(input) {
            case 1:
                comp = new NameAscSort();
                break;
            case 2:
                comp = new NameDscSort();
                break;
            case 3:
                comp = new AgeAscSort();
                break;
            case 4:
                comp = new AgeDscSort();
                break;
            default:
                System.out.println("Invalid Input");            
        }

        TreeMap<Student, College> map = new TreeMap<Student, College>(comp);
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
                 
        System.out.println(map);
    }
}

class NameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student x1 = (Student)o1;
        Student x2 = (Student)o2;

        String nm1 = x1.name;
        String nm2 = x2.name;

        return nm1.compareTo(nm2);
    }
}

class NameDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student x1 = (Student)o1;
        Student x2 = (Student)o2;

        String nm1 = x1.name;
        String nm2 = x2.name;

        return nm2.compareTo(nm1);
    }
}

class AgeAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student x1 = (Student)o1;
        Student x2 = (Student)o2;

        Integer ag1 = x1.age;
        Integer ag2 = x2.age;

        return ag1.compareTo(ag2);
    }
}

class AgeDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student x1 = (Student)o1;
        Student x2 = (Student)o2;

        Integer ag1 = x1.age;
        Integer ag2 = x2.age;

        return ag2.compareTo(ag1);
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

class College {
    String name;    

    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
