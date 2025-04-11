import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press 1 for NAO, \n2 for NDO, \n 3 for AAO, \n 4 for ADO: ");
        int input = sc.nextInt();        
        
        Comparator comp = null;

        if(input == 1) 
            comp = new NameAscSort();
        else if(input == 2)
            comp = new NameDscSort();
        else if(input == 3)
            comp = new AgeAscSort();
        else if(input == 4)
            comp = new AgeDscSort();
        
        TreeSet set = new TreeSet(comp);

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

class NameAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
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
}