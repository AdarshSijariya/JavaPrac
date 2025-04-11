class Student { 
    String name;
    int age;

    public String toString() {
        return name+"-"+age;
    } 
}
class Teacher { }
class L {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "golu";
        x.age = 12;

        Teacher t = new Teacher();

        System.out.println(x);
        System.out.println(x.toString());
        System.out.println(t);
        System.out.println(t.toString());

        Integer i = new Integer(99);

        System.out.println(i);
        System.out.println(i.toString());
    }    
}
