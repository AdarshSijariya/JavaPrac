import java.util.HashMap;

class N {
    public static void main(String[] args) {
        HashMap<Student, College> map = new HashMap<Student, College>();
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
        map.put(new Student("rom", 18), new College("JEC"));
        
        System.out.println(map);        
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