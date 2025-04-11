import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        System.out.println(list);

        list.add(new Student("mohan", 12));
        list.add(new Student("rohan", 9));
        list.add(new Student("sohan", 15));
        list.add(new Student("gohan", 7));
        list.add(new Student("tohan", 13));

        System.out.println(list);
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
}