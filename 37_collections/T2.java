import java.util.TreeMap;

class T2 {
    public static void main(String[] args) {
        TreeMap<Student, College> map = new TreeMap<Student, College>();
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
                 
        System.out.println(map);
    }
}

class Student implements Comparable {
    String name;
    Integer age;
    
    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Object obj) {
        Student x1 = this;
        Student x2 = (Student)obj;

        Integer ag1 = x1.age;
        Integer ag2 = x2.age;

        return ag1.compareTo(ag2);
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
