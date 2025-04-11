import java.util.TreeMap;

class G {
    public static void main(String[] args) {
        TreeMap<Student, College> map = new TreeMap<Student, College>();
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
                 
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
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

    public int compareTo(Student obj) {
        return this.name.compareTo(obj.name);
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
