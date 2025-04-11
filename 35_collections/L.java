import java.util.ArrayList;
import java.util.Iterator;

class L {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        
        System.out.println(list);

        list.add(new Student("mohan", 12));
        list.add(new Student("rohan", 9));
        list.add(new Student("sohan", 15));
        list.add(new Student("gohan", 7));
        list.add(new Student("tohan", 13));

        Iterator<Student> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next() + " ===");
        }
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
        return name+"-"+age;
    }

    public boolean equals(Object obj) {
        Student x1 = this;
        Student x2 = (Student)obj;

        String nm1 = x1.name;
        String nm2 = x2.name;

        System.out.println(nm1 + " ~~~~ " + nm2);

        return nm1.equals(nm2);
    }
}