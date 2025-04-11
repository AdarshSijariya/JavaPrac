import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Y {
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
        
        PriorityQueue set = new PriorityQueue(comp);

        System.out.println(set);        
    
        set.add(new Student("mohan", 34));
        set.add(new Student("tohan", 5));
        set.add(new Student("gohan", 12));
        set.add(new Student("sohan", 56));
        set.add(new Student("rohan", 22));
        set.add(new Student("eohan", 9));
        
        System.out.println(set);        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
        System.out.println(set.poll());        
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
        return name + " - " + age;
    }
}